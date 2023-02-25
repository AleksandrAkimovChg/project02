package tests.men;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

import static testData.ProjectConstants.*;

public class BodyAndShowerTest extends BaseTest {

    @Test
    public void testNavigatesToBodyAndShowerPage() {

        HomePage homePage = openBaseURL();

        String oldURL = homePage.getURL();
        String oldTitle = homePage.getTitle();

        String actualURL = homePage
                .mouseHoverOnMenMenu()
                .clickBodyAndShowerSubmenu()
                .getURL();

        String actualTitle = homePage
                .mouseHoverOnMenMenu()
                .clickBodyAndShowerSubmenu()
                .getTitle().toUpperCase();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_BODY_AND_SHOWER_PAGE);

        Assert.assertNotEquals(oldTitle, actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE_BODY_AND_SHOWER_PAGE);
    }
}
