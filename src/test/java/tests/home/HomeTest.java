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

import static testData.ProjectConstants.ID_50;

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

    @Test
    public void testGetGridProduct1NameAndPrice_ID50() {
        final String expectedProductName = ID_50.toUpperCase();
        final String expectedProductPrice = "29.50";

        HomePage homePage = openBaseURL();

        String gridProductName = homePage.getGridProduct1_Name();
        String gridProductPrice = homePage.getGridProduct1_Price().replaceAll("[$€£]", "");

        Assert.assertEquals(gridProductName, expectedProductName);
        Assert.assertEquals(gridProductPrice, expectedProductPrice);
    }
}
