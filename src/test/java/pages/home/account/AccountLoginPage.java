package pages.home.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.MainPage;
import pages.my_account.MyAccountPage;

public class AccountLoginPage extends MainPage {

    @FindBy(id ="loginFrm_loginname")
    private WebElement userLogin;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@title='Login']")
    private WebElement loginButton;

    public AccountLoginPage(WebDriver driver) {
        super(driver);
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
}
