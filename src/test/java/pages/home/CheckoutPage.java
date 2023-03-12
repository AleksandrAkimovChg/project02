package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.TablePage;
import pages.home.cart.SuccessPage;

public class CheckoutPage extends TablePage {
    @FindBy(xpath = "//button[@id='checkout_btn']")
    private WebElement confirmOrderButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public SuccessPage clickConfirmOrderButton() {
        click10(confirmOrderButton);

        return new SuccessPage(getDriver());
    }
}
