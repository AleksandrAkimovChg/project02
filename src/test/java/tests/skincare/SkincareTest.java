package tests.skincare;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.skincare.SkincarePage;

import static testData.ProjectConstants.SKINCARE_PAGE_TITLE;
import static testData.ProjectConstants.SKINCARE_PAGE_URL;

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
}
