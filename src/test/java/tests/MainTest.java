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

    @Test(dataProviderClass = TestData.class, dataProvider = "BrandsScrollingList")
    public void testBrandsScrollingListLinksNavigateToCorrespondingPages(
            int index, String altText, String href, String url, String title) {

        HomePage homePage = openBaseURL();

        List<WebElement> brandsScrollingMenu = homePage.getBrandsScrollingListHrefLinks();

        String oldUrl = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualAltText = homePage.getAltText(index);
        String actualUrlHref = homePage.getHref(index);

        String actualUrl = homePage.clickMenu(index, brandsScrollingMenu).getURL();
        String actualTitle = homePage.clickHomeMenu().clickMenu(index, brandsScrollingMenu).getTitle();

        Assert.assertNotEquals(actualUrl, oldUrl);
        Assert.assertEquals(actualUrl, url);
        Assert.assertNotEquals(actualTitle, oldTitle);
        Assert.assertEquals(actualTitle, title);
        Assert.assertEquals(actualAltText, altText);
        Assert.assertEquals(actualUrlHref, href);
    }
}