package tests.books;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.books.PaperbackPage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class PaperbackTest extends BaseTest {

    @Test
    public void testProductListSortByAZ() {
        final List<String> productList = List.of(ID_112, ID_113, ID_114);

        List<String> expectedProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnBooksMenu()
                        .clickPaperbackSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByZA() {
        final List<String> productList = List.of(ID_112, ID_113, ID_114);

        List<String> expectedProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnBooksMenu()
                        .clickPaperbackSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByPriceLowHigh() {
        final List<Double> productList = List.of(16.2, 9.99, 7.99);

        List<Double> expectedProductPrices = productList
                .stream()
                .sorted()
                .collect(Collectors.toList());

        List<Double> actualProductPrices = openBaseURL()
                .mouseHoverOnBooksMenu()
                .clickPaperbackSubmenu()
                .clickSortBy()
                .clickSortByPriceLowHigh()
                .getLinksPrices();

        Assert.assertEquals(actualProductPrices, expectedProductPrices);
    }

    @Test
    public void testProductListSortByPriceLowHigh_V2() {
        final Double[] productList = {16.2, 9.99, 7.99};

        PaperbackPage paperbackPage = new PaperbackPage(getDriver());

        Double[] expectedProductPrices = paperbackPage.bubbleSortDoubleArray(productList);

        List<Double> listProductPrices = openBaseURL()
                .mouseHoverOnBooksMenu()
                .clickPaperbackSubmenu()
                .clickSortBy()
                .clickSortByPriceLowHigh()
                .getLinksPrices();

        Double[] actualProductPrices = listProductPrices.stream().toArray(Double[]::new);

        Assert.assertEquals(actualProductPrices, expectedProductPrices);
    }

    @Test
    public void testProductListSortByPriceHighLow() {
        final List<Double> productList = List.of(9.99, 16.20, 7.99);

        List<Double> expectedProductPrices = productList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<Double> actualProductPrices = openBaseURL()
                .mouseHoverOnBooksMenu()
                .clickPaperbackSubmenu()
                .clickSortBy()
                .clickSortByPriceHighLow()
                .getLinksPrices();

        Assert.assertEquals(actualProductPrices, expectedProductPrices);
    }

    @Test
    public void testProductListSortByPriceHighLow_V2() {
        final Double[] productList = {9.99, 16.20, 7.99};

        PaperbackPage paperbackPage = new PaperbackPage(getDriver());

        Double[] sortDoubleArray = paperbackPage.bubbleSortDoubleArray(productList);
        Double[] expectedProductPrices = paperbackPage.reverseDoubleArray(sortDoubleArray);

        List<Double> listProductPrices = openBaseURL()
                .mouseHoverOnBooksMenu()
                .clickPaperbackSubmenu()
                .clickSortBy()
                .clickSortByPriceHighLow()
                .getLinksPrices();

        Double[] actualProductPrices = listProductPrices.stream().toArray(Double[]::new);

        Assert.assertEquals(actualProductPrices, expectedProductPrices);
    }
}
