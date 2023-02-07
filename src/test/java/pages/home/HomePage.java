package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.MainPage;
import pages.home.account.AccountLoginPage;

public class HomePage extends MainPage {

    @FindBy(xpath = "//ul[@id='main_menu_top']//a[@class='top menu_account']")
    private WebElement accountTopMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AccountLoginPage clickAccountMenu() {
        click(accountTopMenu);

        return new AccountLoginPage(getDriver());
    }
}
