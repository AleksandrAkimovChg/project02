package tests.men;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import static testData.ProjectConstants.*;

public class SkincareTest extends BaseTest {

    @Test(priority = -5)
    public void testNavigatesToSkincarePage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnMenMenu()
                .clickSkincareSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnMenMenu()
                .clickSkincareSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_SKINCARE_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_SKINCARE_PAGE);
    }
}
