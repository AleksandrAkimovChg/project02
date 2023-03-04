package tests.men;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import static testData.ProjectConstants.*;

public class FragranceSetsTest extends BaseTest {

    @Test(priority = -5)
    public void testNavigatesToFragranceSetsPage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnMenMenu()
                .clickFragranceSetsSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnMenMenu()
                .clickFragranceSetsSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_FRAGRANCE_SETS_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_FRAGRANCE_SETS_PAGE);
    }
}
