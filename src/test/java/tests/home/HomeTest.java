package tests.home;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import testData.TestData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeTest extends BaseTest {

    @Test
    public void testDropdownSubmenuNamesOnCategoryHomeMenu() {
        final List<String> expectedDropdownSubmenuNames = new ArrayList<>(
                Arrays.asList(" Specials", " Account", " Cart", " Checkout"));

        List<String> actualDropdownSubmenuNames =
                openBaseURL()
                        .mouseHoverOnHomeMenu()
                        .getDropdownHomeMenuList();

        Assert.assertEquals(actualDropdownSubmenuNames, expectedDropdownSubmenuNames);
    }

    @Test
    public void testFourCategoriesOfDropdownSubmenuNamesOnCategoryHomeMenu() {
        final int expectedCategoriesOfDropdownSubmenu = 4;

        int actualCategoriesOfDropdownSubmenu =
                openBaseURL()
                        .mouseHoverOnHomeMenu()
                        .countCategoriesDropdownHomeMenuList();

        Assert.assertEquals(actualCategoriesOfDropdownSubmenu, expectedCategoriesOfDropdownSubmenu);
    }

    @Test(dataProviderClass = TestData.class, dataProvider = "BrandsScrollingList")
    public void testBrandsScrollingListLinksNavigateToCorrespondingPages(
            int index, String altText, String href, String url, String title) {

        HomePage homePage = openBaseURL();

        List<WebElement> brandsScrollingMenu = homePage.getBrandsScrollingListHrefLinks();

        String oldUrl = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualAltText = homePage.getBrandsScrollingListAltText(index);
        String actualUrlHref = homePage.getBrandsScrollingListHref(index);

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
