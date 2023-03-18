package tests.makeup;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class FaceTest extends BaseTest {
    @Test
    public void testFaceMakeupProductListSortByAZ() {
        final List<String> productList = List.of(ID_57, ID_58);

        List<String> expectedFaceProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualFaceProductList =
                openBaseURL()
                        .mouseHoverOnMakeupMenu()
                        .clickFaceMakeupSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualFaceProductList, expectedFaceProductList);
    }

    @Test
    public void testFaceMakeupProductListSortByZA() {
        final List<String> productList = List.of(ID_57, ID_58);

        List<String> expectedFaceProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualFaceProductList =
                openBaseURL()
                        .mouseHoverOnMakeupMenu()
                        .clickFaceMakeupSubmenu()
                        .clickSortBy()
                        .clickSortByZA()
                        .getLinksText();

        Assert.assertEquals(actualFaceProductList, expectedFaceProductList);
    }
}
