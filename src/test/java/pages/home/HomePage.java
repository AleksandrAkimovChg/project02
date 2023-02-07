package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.MainPage;
import pages.home.account.AccountLoginPage;

public class HomePage extends MainPage {

    @FindBy(xpath = "//ul[@id='main_menu_top']//a[@class='top menu_account']")
    private WebElement accountTopMenu;

    @FindBy(xpath = "//ul[@id='main_menu_top']//a[@class='sub menu_login']")
    private WebElement loginAccountSubmenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickAccountMenu() {
        click(accountTopMenu);

        return new HomePage(getDriver());
    }

    public AccountLoginPage clickLoginAccountSubmenu() {
        click(accountTopMenu);
        scrollByVisibleElement(loginAccountSubmenu);
        click(loginAccountSubmenu);

        return new AccountLoginPage(getDriver());
    }
}
