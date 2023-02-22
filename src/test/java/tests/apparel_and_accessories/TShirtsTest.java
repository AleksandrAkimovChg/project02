package tests.apparel_and_accessories;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TShirtsTest extends BaseTest {
    @Test
    public void testProductListSortByAZ () {

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .mouseHoverOnTShirtSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        List<String> expectedProductList = actualProductList.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(expectedProductList, actualProductList);
    }

    @Test
    public void testProductListSortByZA () {

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .mouseHoverOnTShirtSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        List<String> expectedProductList = actualProductList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(expectedProductList, actualProductList);
    }

    @Test
    public void testProductListSortByPriceLowHigh () {

        List<Double> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessories()
                        .mouseHoverSubMenu()
                        .clickSortBy()
                        .clickSortByPriceLowHigh()
                        .getLinksPrices();

        List<Double> expectedProductList = actualProductList.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(expectedProductList, actualProductList);
    }

    @Test
    public void testProductListSortByPriceHighLow () {

        List<Double> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessories()
                        .mouseHoverSubMenu()
                        .clickSortBy()
                        .clickSortByPriceHighLow()
                        .getLinksPrices();

        List<Double> expectedProductList = actualProductList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(expectedProductList, actualProductList);
    }
}
