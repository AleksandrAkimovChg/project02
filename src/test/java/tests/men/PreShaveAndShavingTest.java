package tests.men;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import static testData.ProjectConstants.*;

public class PreShaveAndShavingTest extends BaseTest {

    @Test(priority = -5)
    public void testNavigatesToPreShaveAndShavingPage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnMenMenu()
                .clickPreShaveAndShavingSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnMenMenu()
                .clickPreShaveAndShavingSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_PRESHAVE_AND_SHAVING_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_PRESHAVE_AND_SHAVING_PAGE);
    }
}
