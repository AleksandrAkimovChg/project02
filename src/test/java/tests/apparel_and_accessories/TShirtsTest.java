package tests.apparel_and_accessories;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TShirtsTest extends BaseTest {
    @Test
    public void testProductListSortByAZ () {

        List<String> actualProductList =
                openBaseURL()
                .mouseHoverOnApparelAccessories()
                .mouseHoverSubMenu()
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
                        .mouseHoverOnApparelAccessories()
                        .mouseHoverSubMenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        List<String> expectedProductList = actualProductList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assert.assertEquals(expectedProductList, actualProductList);
    }
}
