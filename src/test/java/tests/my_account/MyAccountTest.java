package tests.my_account;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.my_account.MyAccountPage;
import testData.TestData;

import java.util.List;

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

    @Test
    public void testLoginSubmenuText_changesToLogoutAfterLogin() {
        final String expectedLoginMenuText = " LOGIN";
        final String expectedLogoutMenuText = "LOGOUT";

        String oldLoginMenuText = openBaseURL()
                .mouseHoverAccountTopMenu()
                .getAccountLoginSubmenuText();

        HomePage homePage = new HomePage(getDriver());

        String actualLogoutMenuText = homePage.clickAccountMenu()
                .clickLoginAccountSubmenu()
                .clickClearInputRegularUserLogin(LOGIN_NAME)
                .clickClearInputRegularUserPassword(PASSWORD)
                .clickLoginButton()
                .mouseHoverAccountTopMenu()
                .getAccountLogoutSubmenuText();

        Assert.assertEquals(oldLoginMenuText, expectedLoginMenuText);
        Assert.assertEquals(actualLogoutMenuText, expectedLogoutMenuText);
    }

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

    @Test(dataProviderClass = TestData.class, dataProvider = "MyAccountSideMenuList")
    public void testMyAccountSideMenuLinks_NavigateToCorrespondingPages(
            int index, String menuText, String href, String url, String header, String title) {

        MyAccountPage myAccountPage = openBaseURL()
                .clickAccountMenu()
                .clickLoginAccountSubmenu()
                .clickClearInputRegularUserLogin(LOGIN_NAME)
                .clickClearInputRegularUserPassword(PASSWORD)
                .clickLoginButton();

        List<WebElement> myAccountSideMenu = myAccountPage.getMyAccountSideMenuLinks();

        String oldUrl = myAccountPage.getURL();
        String oldHeader = myAccountPage.getH1HeaderText();

        String actualHref = myAccountPage.getMyAccountSideMenuHrefByIndex(index);
        String actualMenuText = myAccountPage.getMyAccountSideMenuTextByIndex(index);

        String actualUrl = myAccountPage.clickMenu(index, myAccountSideMenu).getURL();
        String actualH1Header = myAccountPage.getH1HeaderText();
        String actualTitle = myAccountPage.getTitle();

        if (index < 1) {
            Assert.assertEquals(actualUrl, oldUrl);
            Assert.assertEquals(actualH1Header, oldHeader);
        } else {
            Assert.assertNotEquals(actualUrl, oldUrl);
            Assert.assertNotEquals(actualH1Header, oldHeader);
        }

        Assert.assertEquals(actualMenuText, menuText);
        Assert.assertEquals(actualHref, href);

        Assert.assertEquals(actualUrl, url);
        Assert.assertEquals(actualH1Header, header);
        Assert.assertEquals(actualTitle, title);
    }
}
