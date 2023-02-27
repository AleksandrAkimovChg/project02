package tests.men;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.men.MenPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class MenTest extends BaseTest {

    @Test
    public void testNavigatesToMen_ID58_Page() {
        MenPage menPage = openBaseURL()
                .clickMenMenu();

        Assert.assertEquals(menPage.getURL(), MEN_PAGE_URL);
        Assert.assertEquals(menPage.getTitle(), MEN_PAGE_TITLE);
    }

    @Test
    public void testAPIAllLinksAreNotBrokenMen_ID58_Page() {
        String linkURL = "";
        int responseCode;
        int actualWorkingLinksCount = 0;

        MenPage menPage = openBaseURL().clickMenMenu();

        List<WebElement> linksList = menPage.getMenMenuList();

        final int expectedWorkingLinksCount = linksList.size();
        int internalLinks = expectedWorkingLinksCount;

        for (WebElement link : linksList) {
            linkURL = link.getAttribute("href");

            if (linkURL != null && !linkURL.isBlank() && !linkURL.isEmpty()) {
                if (!linkURL.startsWith(getBaseUrl())) {
                    Reporter.log(linkURL + " is externalLink ", true);
                    internalLinks--;
                } else {
                    try {
                        HttpURLConnection connection = (HttpURLConnection) (new URL(linkURL).openConnection());
                        connection.setRequestMethod("HEAD");
                        connection.connect();

                        responseCode = connection.getResponseCode();

                        if (responseCode == 200) {
                            actualWorkingLinksCount++;
                        } else {
                            Reporter.log(linkURL + " is broken, responseCode " + responseCode, true);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        Assert.assertEquals(menPage.getURL(), MEN_PAGE_URL);
        Assert.assertEquals(actualWorkingLinksCount, internalLinks);
        Assert.assertEquals(actualWorkingLinksCount, expectedWorkingLinksCount);
    }

    @Test
    public void testAPIAllLinksAreNotBrokenMenStream_ID58_Page() {
        MenPage menPage = openBaseURL().clickMenMenu();
        List<WebElement> linksList = menPage.getMenMenuList();

        int expectedWorkingLinksCount = linksList.size();

        Map<Boolean, List<String>> linksByInternalOrExternal = linksList.stream()
                .map(link -> link.getAttribute("href"))
                .filter(linkURL -> linkURL != null && !linkURL.isBlank() && !linkURL.isEmpty())
                .collect(Collectors.partitioningBy(linkURL -> linkURL.startsWith(getBaseUrl())));

        List<String> externalLinks = linksByInternalOrExternal.get(false);
        List<String> internalLinks = linksByInternalOrExternal.get(true);

        int internalLinksCount = internalLinks.size();
        int actualWorkingLinksCount = (int) internalLinks.stream()
                .map(linkURL -> {
                    try {
                        HttpURLConnection connection = (HttpURLConnection) (new URL(linkURL).openConnection());
                        connection.setRequestMethod("HEAD");
                        connection.connect();

                        int responseCode = connection.getResponseCode();

                        if (responseCode == 200) {
                            return true;
                        } else {
                            Reporter.log(linkURL + " is broken, responseCode " + responseCode, true);
                            return false;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        return false;
                    }
                })
                .filter(isWorking -> isWorking)
                .count();

        Assert.assertEquals(menPage.getURL(), MEN_PAGE_URL, "The Men page URL is as expected");
        Assert.assertEquals(actualWorkingLinksCount, internalLinksCount, "Number of internal working links is as expected");
        Assert.assertEquals(actualWorkingLinksCount, expectedWorkingLinksCount, "Number of working links is as expected");
        Assert.assertEquals(externalLinks.size(), 0, "External links are present in the Men page menu");
    }
}

