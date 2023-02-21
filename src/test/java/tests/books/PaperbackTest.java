package tests.books;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class PaperbackTest extends BaseTest {

    @Test
    public void testProductListSortByAZ() {
        final List<String> productList = List.of(ID_112.toUpperCase(), ID_113.toUpperCase(), ID_114.toUpperCase());

        List<String> expectedProductList = productList
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnBooksMenu()
                        .mouseHoverOnPaperbackSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByZA () {
        final List<String> productList = List.of(ID_112.toUpperCase(), ID_113.toUpperCase(), ID_114.toUpperCase());

        List<String> expectedProductList = productList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnBooksMenu()
                        .mouseHoverOnPaperbackSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);

    }
}
