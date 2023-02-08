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
}
