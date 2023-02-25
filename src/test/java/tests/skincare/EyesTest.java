package tests.skincare;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class EyesTest extends BaseTest {

    @Test
    public void testEyesProductListSortedByAZ() {
        final List<String> productList = List.of(ID_65, ID_96, ID_97);

        List<String> expectedEyesProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        List<String> actualEyesProductList =
                openBaseURL()
                        .mouseHoverOnSkincareMenu()
                        .clickEyesSubmenu()
                        .clickSortBy()
                        .clickSortByAZ()
                        .getLinksText();

        Assert.assertEquals(actualEyesProductList, expectedEyesProductList);
    }
}
