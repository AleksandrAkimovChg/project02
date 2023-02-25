package tests.men;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class BodyAndShowerTest extends BaseTest {

    @Test (priority = -5)
    public void testNavigatesToBodyAndShowerPage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnMenMenu()
                .clickBodyAndShowerSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnMenMenu()
                .clickBodyAndShowerSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_BODY_AND_SHOWER_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_BODY_AND_SHOWER_PAGE);
    }

    @Test (priority = -1, dependsOnMethods = "testNavigatesToBodyAndShowerPage")
    public void testProductListSortByAZ() {
        final List<String> productList = List.of(ID_75, ID_77, ID_107);

        List<String> expectedProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnMenMenu()
                        .clickBodyAndShowerSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test(priority = -1, dependsOnMethods = "testNavigatesToBodyAndShowerPage")
    public void testProductListSortByZA() {
        final List<String> productList = List.of(ID_75, ID_77, ID_107);

        List<String> expectedProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnMenMenu()
                        .clickBodyAndShowerSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }
}
