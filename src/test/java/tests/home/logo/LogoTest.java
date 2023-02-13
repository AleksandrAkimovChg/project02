package tests.home.logo;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

public class LogoTest extends BaseTest {

    @Test
    public void testLogoTitle_Text_Href() {

        String expectedLogoHref = "https://automationteststore.com/";
        String expectedLogoTitle = "Automation Test Store";
        String expectedLogoText = "Automation Test Store";

        Assert.assertEquals(openBaseURL().getLogoHref(), expectedLogoHref);
        Assert.assertEquals(openBaseURL().getLogoTitle(), expectedLogoTitle);
        Assert.assertEquals(openBaseURL().getLogoText(), expectedLogoText);
    }

    @Test
    public void testLogoIsDisplayed_WhenOnHomePageAndOnAccountLoginPage() {

        HomePage homePage = new HomePage(getDriver());

        boolean logoDisplayedOnAccountLoginPage =
                openBaseURL()
                        .clickAccountMenu()
                        .clickLoginAccountSubmenu()
                        .isLogoDisplayed();

        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is displayed on the homepage");
        Assert.assertTrue(logoDisplayedOnAccountLoginPage, "Logo is displayed on the AccountLoginPage");
    }

    @Test
    public void testLogoIsClickableAndNavigatesToHomePage() {

        HomePage homePage = new HomePage(getDriver());

        String expectedHomePageURL = "https://automationteststore.com/";
        String actualHomePageURL =
                openBaseURL()
                        .clickAccountMenu()
                        .clickLoginAccountSubmenu()
                        .clickLogo()
                        .getURL();

        Assert.assertTrue(homePage.isLogoClickable());
        Assert.assertEquals(actualHomePageURL, expectedHomePageURL);
    }
}