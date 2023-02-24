package tests.apparel_and_accessories;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class ShoesTest extends BaseTest {

    @Test
    public void testNavigatesToShoesPage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnApparelAndAccessoriesMenu()
                .clickShoesSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnApparelAndAccessoriesMenu()
                .clickShoesSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_SHOES_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_SHOES_PAGE);
    }

    @Test
    public void testProductListSortByAZ() {
        final List<String> productList = List.of(ID_115, ID_116, ID_117, ID_118);

        List<String> expectedProductList = productList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<String> actualProductList =
                openBaseURL()
                        .mouseHoverOnApparelAndAccessoriesMenu()
                        .clickShoesSubmenu()
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
                            .mouseHoverOnApparelAndAccessoriesMenu()
                            .clickShoesSubmenu()
                            .clickSortBy()
                            .clickSortByZA()
                            .getLinksText();

            Assert.assertEquals(actualProductList, expectedProductList);
    }
}
