package tests.apparel_and_accessories;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class ShoesTest extends BaseTest {

    @Test
    public void testProductListSortByAZ() {
        final List<String> productList = List.of(ID_115.toUpperCase(), ID_116.toUpperCase(), ID_117.toUpperCase(),
                ID_118.toUpperCase());

        List<String> expectedProductList = productList
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .mouseHoverOnShoesSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualProductList, expectedProductList);
    }

    @Test
    public void testProductListSortByZA() {
            final List<String> productList = List.of(ID_115, ID_116, ID_117, ID_118);

            List<String> expectedProductList = productList
                    .stream()
                    .map(String::toUpperCase)
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
