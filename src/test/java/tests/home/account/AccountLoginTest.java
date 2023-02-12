package tests.home.account;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.home.account.AccountLoginPage;

import static testData.ProjectConstants.*;


public class AccountLoginTest extends BaseTest {

    @Test
    public void testLoginMenuCustomerText_changesAfterLogin() {
        final String expectedLoginMenuText = "Welcome back Test";

        HomePage homePage = new HomePage(getDriver());

        String oldLoginMenuText = openBaseURL().getLoginCustomerText();

        homePage.clickLoginCustomerMenu()
                .clickClearInputRegularUserLogin(LOGIN_NAME)
                .clickClearInputRegularUserPassword(PASSWORD)
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
                        .clickClearInputRegularUserLogin(LOGIN_NAME)
                        .clickClearInputRegularUserPassword(invalidPassword)
                        .clickLoginButtonFailedLogin()
                        .getErrorAlertText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testErrorAlertIsDismissed_WhenClickCloseButton() {

        AccountLoginPage loginPage = new AccountLoginPage(getDriver());

      Assert.assertTrue(
              openBaseURL()
                      .clickAccountMenu()
                      .clickLoginAccountSubmenu()
                      .clickClearInputRegularUserLogin(LOGIN_NAME)
                      .clickClearInputRegularUserPassword(WRONG_PASSWORD)
                      .clickLoginButtonFailedLogin()
                      .isErrorMessagePresent()
              );

      Assert.assertFalse(loginPage.clickCloseButtonForErrorMessage().isErrorMessagePresent());
    }
}
