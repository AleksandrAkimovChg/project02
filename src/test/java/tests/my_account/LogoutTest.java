package tests.my_account;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.my_account.LogoutPage;
import pages.my_account.MyAccountPage;

import static testData.ProjectConstants.LOGUNT_PAGE_URL;

public class LogoutTest extends BaseTest {

    @Test
    public void testClickLogofLink_navigatesTo_LogoutPage() {

        final String expectedURL = LOGUNT_PAGE_URL;
        final String expectedTitle = "Account Logout";
        final String expectedTH1Header = "ACCOUNT LOGOUT";

        String oldURL = openBaseURL().BaseLogIn().getURL();

        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        LogoutPage logoutPage = myAccountPage.clickLogoffLink();

        String actualURL = logoutPage.getURL();
        String actualTitle = logoutPage.getTitle();
        String actualTH1Header = logoutPage.getH1HeaderText();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertEquals(expectedTH1Header, actualTH1Header);
    }
}
