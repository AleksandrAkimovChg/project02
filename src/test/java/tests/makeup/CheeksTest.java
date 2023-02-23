package tests.makeup;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class CheeksTest extends BaseTest {

    @Test
    public void testProductPriceTagChangedWhenAddedToCart() {

        Assert.assertTrue(

        openBaseURL()
                .mouseHoverOnMakeupMenu()
                .mouseHoverOnCheeksSubmenu()
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
                        .mouseHoverOnCheeksSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(expectedCheeksProductList, actualCheeksProductList);
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
                        .mouseHoverOnCheeksSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(expectedCheeksProductList, actualCheeksProductList);
    }
}