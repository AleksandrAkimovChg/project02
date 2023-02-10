package pages.home.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base_abstract.FormPage;
import pages.my_account.MyAccountPage;

public class AccountLoginPage extends FormPage {

    @FindBy(xpath = "//ul[@id='main_menu_top']//a[@class='sub menu_login']")
    private WebElement loginAccountSubmenu;

    @FindBy(id ="loginFrm_loginname")
    private WebElement userLogin;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@title='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class = 'alert alert-error alert-danger']")
    private WebElement errorAlert;

    public AccountLoginPage(WebDriver driver) {
        super(driver);
    }

    public AccountLoginPage clickLoginAccountSubmenu() {
        scrollByVisibleElement(loginAccountSubmenu);
        clickByJavaScript(loginAccountSubmenu);

        return new AccountLoginPage(getDriver());
    }

    public AccountLoginPage clickClearInputRegularUserLogin() {
        click(userLogin);
        userLogin.clear();
        String login = "testtestoff940";
        input(login, userLogin);

        return this;
    }

    public AccountLoginPage clickClearInputRegularUserLogin(String login) {
        click(userLogin);
        userLogin.clear();
        input(login, userLogin);

        return this;
    }

    public AccountLoginPage clickClearInputRegularUserPassword() {
        click(userPassword);
        userPassword.clear();
        String password = "Testoff29012003";
        input(password, userPassword);

        return this;
    }

    public AccountLoginPage clickClearInputRegularUserPassword(String password) {
        click(userPassword);
        userPassword.clear();
        input(password, userPassword);

        return this;
    }

    public MyAccountPage clickLoginButton() {
        click(loginButton);

        return new MyAccountPage(getDriver());
    }

    public AccountLoginPage clickLoginButtonFailedLogin() {
        click(loginButton);

        return this;
    }

    public String getErrorAlertText() {

        return errorAlert.getText();
    }
}
