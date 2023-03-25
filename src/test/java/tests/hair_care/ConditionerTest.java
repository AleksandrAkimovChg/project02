package tests.hair_care;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.hair_care.ConditionerPage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class ConditionerTest extends BaseTest {

    @Test
    public void testConditionerProductListByAZ() {
        final List<String> productList = List.of(ID_69, ID_71, ID_72, ID_73, ID_101);

        List<String> expectedProductList =
                productList
                        .stream()
                        .map(String::toUpperCase)
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnHaircareMenu()
                        .clickConditionerSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testConditionerProductListByZA() {
        final List<String> productList = List.of(ID_69, ID_71, ID_72, ID_73, ID_101);

        List<String> expectedProductList =
                productList
                        .stream()
                        .map(String::toUpperCase)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnHaircareMenu()
                        .clickConditionerSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testConditionerProductListByPriceLowToHigh() {
        final Double[] productPrice = {19.0, 8.23, 11.45, 24.0, 33.0};

        ConditionerPage conditionerPage = new ConditionerPage(getDriver());

        Double[] expectedProductPrices = conditionerPage.bubbleSortDoubleArray(productPrice);

        List<Double> productPriceList = openBaseURL()
                .mouseHoverOnHaircareMenu()
                .clickConditionerSubmenu()
                .clickSortBy()
                .clickSortByPriceLowHigh()
                .getLinksPrices();

        Double[] actualProductPrices = productPriceList.stream().toArray(Double[]::new);

        Assert.assertEquals(actualProductPrices, expectedProductPrices);
    }

    @Test
    public void testConditionerProductListByPriceHighToLow() {
        final Double[] productPrice = {19.0, 8.23, 11.45, 24.0, 33.0};

        ConditionerPage conditionerPage = new ConditionerPage(getDriver());

        Double[] sortDoubleArray = conditionerPage.bubbleSortDoubleArray(productPrice);
        Double[] expectedProductPrices = conditionerPage.reverseDoubleArray(sortDoubleArray);

        List<Double> productPriceList = openBaseURL()
                .mouseHoverOnHaircareMenu()
                .clickConditionerSubmenu()
                .clickSortBy()
                .clickSortByPriceHighLow()
                .getLinksPrices();

        Double[] actualProductPrices = productPriceList.stream().toArray(Double[]::new);

        Assert.assertEquals(actualProductPrices, expectedProductPrices);
    }
}
