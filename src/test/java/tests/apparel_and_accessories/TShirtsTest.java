package tests.apparel_and_accessories;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class TShirtsTest extends BaseTest {
    @Test
    public void testProductListSortByAZ () {

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .clickTShirtSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        List<String> expectedProductList = actualProductList.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByZA () {

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .clickTShirtSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        List<String> expectedProductList = actualProductList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByPriceLowHigh () {

        List<Double> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .clickTShirtSubmenu()
                        .clickSortBy()
                        .clickSortByPriceLowHigh()
                        .getLinksPrices();

        List<Double> expectedProductList = actualProductList.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByPriceHighLow () {

        List<Double> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .clickTShirtSubmenu()
                        .clickSortBy()
                        .clickSortByPriceHighLow()
                        .getLinksPrices();

        List<Double> expectedProductList = actualProductList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testNavigatesToTShirtsPage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnApparelAndAccessoriesMenu()
                .clickTShirtSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnApparelAndAccessoriesMenu()
                .clickTShirtSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_TSHIRTS_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_TSHIRTS_PAGE);
    }
}
