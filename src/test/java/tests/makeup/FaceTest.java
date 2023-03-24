package tests.makeup;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class FaceTest extends BaseTest {
    @Test
    public void testNavigatesToFaceMakeupPage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnMakeupMenu()
                .clickFaceMakeupSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnMakeupMenu()
                .clickFaceMakeupSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_FACE_MAKEUP_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_FACE_MAKEUP_PAGE);
    }

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
