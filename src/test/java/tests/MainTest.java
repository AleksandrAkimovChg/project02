package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import testData.TestData;

import java.util.List;

public class MainTest extends BaseTest {

    @Test
    public void testBaseURLLoadedSuccessfully() {
        final String expectedUrl = getBaseUrl();

        String actualUrl =
                openBaseURL()
                        .getURL();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test(dataProviderClass = TestData.class, dataProvider = "FooterMenuList")
    public void testFooterMenuLinksNavigateToCorrespondingPages(
            int index, String menuText, String href, String url, String title) {

        HomePage homePage = openBaseURL();

        List<WebElement> footerMenu = homePage.getFooterMenuLinks();

        String oldUrl = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualHref = homePage.getFooterMenuHrefByIndex(index);
        String actualMenuText = homePage.getFooterMenuTextByIndex(index);
        String actualUrl = homePage.clickMenu(index, footerMenu).getURL();
        String actualTitle = homePage.clickMenu(index, footerMenu).getTitle();

        Assert.assertNotEquals(actualUrl, oldUrl);
        Assert.assertEquals(actualUrl, url);

        Assert.assertNotEquals(actualTitle, oldTitle);
        Assert.assertEquals(actualTitle, title);

        Assert.assertEquals(actualMenuText, menuText);
        Assert.assertEquals(actualHref, href);
    }
}
