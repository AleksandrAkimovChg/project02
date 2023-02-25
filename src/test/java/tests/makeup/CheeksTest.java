package tests.makeup;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class CheeksTest extends BaseTest {

    @Test
    public void testProductPriceTagChangedWhenAddedToCart() {

        Assert.assertTrue(

        openBaseURL()
                .mouseHoverOnMakeupMenu()
                .clickCheeksSubmenu()
                .clickAddToCart()
                .isPriceTagChanged()
        );
    }

    @Test
    public void testCheeksProductListSortByAZ() {
        final List<String> productList = List.of(ID_50, ID_53, ID_51, ID_52);

        List<String> expectedCheeksProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualCheeksProductList =
                openBaseURL()
                        .mouseHoverOnMakeupMenu()
                        .clickCheeksSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualCheeksProductList, expectedCheeksProductList);
    }

    @Test
    public void testCheeksProductListSortByZA() {
        final List<String> productList = List.of(ID_50, ID_53, ID_51, ID_52);

        List<String> expectedCheeksProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualCheeksProductList =
                openBaseURL()
                        .mouseHoverOnMakeupMenu()
                        .clickCheeksSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualCheeksProductList, expectedCheeksProductList);
    }

    @Test
    public void testCheeksProductListSortByPriceLowHigh() {
        final List<Double> productList = List.of(19.00, 28.00, 29.50, 38.50);

        List<Double> expectedCheeksProductPrices = productList
                .stream()
                .sorted()
                .collect(Collectors.toList());

        List<Double> actualCheeksProductPrices = openBaseURL()
                .mouseHoverOnMakeupMenu()
                .clickCheeksSubmenu()
                .clickSortBy()
                .clickSortByPriceLowHigh()
                .getLinksPrices();

        Assert.assertEquals(actualCheeksProductPrices, expectedCheeksProductPrices);
    }

    @Test
    public void testCheeksProductListSortByPriceHighLow() {
        final List<Double> productList = List.of(19.00, 28.00, 29.50, 38.50);

        List<Double> expectedCheeksProductPrices = productList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<Double> actualCheeksProductPrices = openBaseURL()
                .mouseHoverOnMakeupMenu()
                .clickCheeksSubmenu()
                .clickSortBy()
                .clickSortByPriceHighLow()
                .getLinksPrices();

        Assert.assertEquals(actualCheeksProductPrices, expectedCheeksProductPrices);
    }
}
