package tests.my_account;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.my_account.MyAccountPage;

import static testData.ProjectConstants.*;

public class MyAccountTest extends BaseTest {

    @Test
    public void testLoginWithValidCredentials_NavigatesToMyAccountPage() {
        final String expectedURL = "https://automationteststore.com/index.php?rt=account/account";
        final String expectedTitle = "My Account";

        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        String oldURL = openBaseURL().getURL();
        String actualURL =
                openBaseURL()
                        .clickAccountMenu()
                        .clickLoginAccountSubmenu()
                        .clickClearInputRegularUserLogin(LOGIN_NAME)
                        .clickClearInputRegularUserPassword(PASSWORD)
                        .clickLoginButton()
                        .getURL();

        Assert.assertNotEquals(oldURL, actualURL);

        String actualTitle = myAccountPage.getTitle();

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
