package tests.skincare;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.skincare.SkincarePage;

import static testData.ProjectConstants.*;

public class SkincareTest extends BaseTest {

    @Test
    public void testSkincareLink_NavigatesTo_SkincarePage() {

        SkincarePage  skincarePage = new SkincarePage(getDriver());

        String oldURL = openBaseURL()
                        .getURL();

        new HomePage(getDriver()).clickSkincareMenu();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());
        Assert.assertEquals(skincarePage.getURL(), SKINCARE_PAGE_URL);
        Assert.assertEquals(skincarePage.getTitle(), SKINCARE_PAGE_TITLE);
    }

    @Test
    public void testGiftIdeasAndSetsSubmenuLink_NavigatesTo_ID43_45_Page() {
        final String expectedTitle = "Gift Ideas & Sets";
        final String expectedUrl = SKINCARE_PAGE_URL + "_45";

        SkincarePage skincarePage = new SkincarePage(getDriver());

        String oldURL = openBaseURL()
                .getURL();

        new HomePage(getDriver())
                .mouseHoverOnSkincareMenu()
                .clickGiftIdeasAndSetsSubmenu();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());
        Assert.assertEquals(skincarePage.getURL(), expectedUrl);
        Assert.assertEquals(skincarePage.getTitle(), expectedTitle);
    }

    @Test
    public void testHandsAndNailsSubmenuLink_NavigatesTo_ID43_48_Page() {
        final String expectedTitle = "Hands & Nails";
        final String expectedUrl = SKINCARE_PAGE_URL + "_48";

        SkincarePage skincarePage = new SkincarePage(getDriver());

        String oldURL = openBaseURL()
                .getURL();

        new HomePage(getDriver())
                .mouseHoverOnSkincareMenu()
                .clickHandsAndNailsSubmenu();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());
        Assert.assertEquals(skincarePage.getURL(), expectedUrl);
        Assert.assertEquals(skincarePage.getTitle(), expectedTitle);
    }

    @Test
    public void testSunSubmenuLink_NavigatesTo_ID43_44_Page() {
        final String expectedTitle = "Sun";
        final String expectedUrl = SKINCARE_PAGE_URL + "_44";

        SkincarePage skincarePage = new SkincarePage(getDriver());

        String oldURL = openBaseURL()
                .getURL();

        new HomePage(getDriver())
                .mouseHoverOnSkincareMenu()
                .clickSunSubmenu();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());
        Assert.assertEquals(skincarePage.getURL(), expectedUrl);
        Assert.assertEquals(skincarePage.getTitle(), expectedTitle);
    }

    @Test
    public void testEyesSubmenuLink_NavigatesToEyesPage() {

        SkincarePage skincarePage = new SkincarePage(getDriver());

        String oldURL = openBaseURL()
                        .getURL();

        new HomePage(getDriver())
                .mouseHoverOnSkincareMenu()
                .clickEyesSubmenu();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());
        Assert.assertEquals(skincarePage.getURL(), EYES_SKINCARE_PAGE_URL);
        Assert.assertEquals(skincarePage.getTitle(), EYES_SKINCARE_PAGE_TITLE);
    }
}
