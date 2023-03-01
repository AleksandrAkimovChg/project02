package tests.makeup;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class EyesTest extends BaseTest {

    @Test
    public void testEyesMakeupProductListSortByAZ() {
        final List<String> productList = List.of(ID_54, ID_108, ID_56);

        List<String> expectedEyesProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualEyesProductList =
                openBaseURL()
                        .mouseHoverOnMakeupMenu()
                        .clickEyesMakeupSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualEyesProductList, expectedEyesProductList);
    }

    @Test
    public void testEyesMakeupProductListSortByZA() {
        final List<String> productList = List.of(ID_54, ID_108, ID_56);

        List<String> expectedEyesProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualEyesProductList =
                openBaseURL()
                        .mouseHoverOnMakeupMenu()
                        .clickEyesMakeupSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualEyesProductList, expectedEyesProductList);
    }

    @Test
    public void testEyesMakeupProductListSortByPriceLowHigh() {
        final List<Double> productList = List.of(25.00, 125.00, 29.50);

        List<Double> expectedEyesProductPrices = productList
                .stream()
                .sorted()
                .collect(Collectors.toList());

        List<Double> actualEyesProductPrices = openBaseURL()
                .mouseHoverOnMakeupMenu()
                .clickEyesMakeupSubmenu()
                .clickSortBy()
                .clickSortByPriceLowHigh()
                .getLinksPrices();

        Assert.assertEquals(actualEyesProductPrices, expectedEyesProductPrices);
    }

    @Test
    public void testEyesMakeupProductListSortByPriceHighLow() {
        final List<Double> productList = List.of(25.00, 125.00, 29.50);

        List<Double> expectedEyesProductPrices = productList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<Double> actualEyesProductPrices = openBaseURL()
                .mouseHoverOnMakeupMenu()
                .clickEyesMakeupSubmenu()
                .clickSortBy()
                .clickSortByPriceHighLow()
                .getLinksPrices();

        Assert.assertEquals(actualEyesProductPrices, expectedEyesProductPrices);
    }
}
