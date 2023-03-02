package tests.fragrance;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class WomenTest extends BaseTest {

    @Test
    public void testProductListSortByAZ() {
        final List<String> productList = List.of(ID_64, ID_79, ID_84, ID_85, ID_88, ID_89, ID_90, ID_102,
                ID_104, ID_105, ID_106, ID_110);

        List<String> expectedProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualProductList = openBaseURL()
                .mouseHoverOnFragranceMenu()
                .clickWomenSubmenu()
                .clickSortBy()
                .clickSortByAZ()
                .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByZA() {
        final List<String> productList = List.of(ID_64, ID_79, ID_84, ID_85, ID_88, ID_89, ID_90, ID_102,
                ID_104, ID_105, ID_106, ID_110);

        List<String> expectedResult = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualResult = openBaseURL()
                .mouseHoverOnFragranceMenu()
                .clickWomenSubmenu()
                .clickSortBy()
                .clickSortByZA()
                .getLinksText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
