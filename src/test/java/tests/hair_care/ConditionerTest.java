package tests.hair_care;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

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
                        .mouseHoverOnConditionerSubmenu()
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
                        .mouseHoverOnConditionerSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }
}
