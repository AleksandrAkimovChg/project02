package tests.home.account;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;

public class AccountLoginTest extends BaseTest {

    @Test
    public void testLoginMenuCustomerText_changesAfterLogin() {
        final String expectedLoginMenuText = "Welcome back Test";

        HomePage homePage = new HomePage(getDriver());

        String oldLoginMenuText = openBaseURL().getLoginCustomerText();

        homePage.clickLoginCustomerMenu()
                .clickClearInputRegularUserLogin("testtestoff940")
                .clickClearInputRegularUserPassword("Testoff29012003")
                .clickLoginButton();

        String actualLoginMenuText = homePage.getLoginCustomerText();

        Assert.assertNotEquals(oldLoginMenuText, actualLoginMenuText);
        Assert.assertEquals(actualLoginMenuText, expectedLoginMenuText);
    }

    @Test
    public void testLoginWithValidUsernameAndInvalidPassword() {
        final String expectedMessage = "×\n" +
                "Error: Incorrect login or password provided.";
        final String invalidPassword = "wrong_password";

        String actualMessage =
                openBaseURL()
                        .clickAccountMenu()
                        .clickLoginAccountSubmenu()
                        .clickClearInputRegularUserLogin("testtestoff940")
                        .clickClearInputRegularUserPassword(invalidPassword)
                        .clickLoginButtonFailedLogin()
                        .getErrorAlertText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
