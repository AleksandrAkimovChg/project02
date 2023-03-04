package pages.home.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.TablePage;

public class CartPage extends TablePage {

    @FindBy(xpath = "//a[@id='cart_checkout1']")
    private WebElement cartCheckoutButton1;

    @FindBy(xpath = "//a[@id='cart_checkout2']")
    private WebElement cartCheckoutButton2;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage clickCartCheckoutButton1() {
        click(cartCheckoutButton1);

        return new CartPage(getDriver());
    }

    public CartPage clickCartCheckoutButton2() {
        click(cartCheckoutButton1);

        return new CartPage(getDriver());
    }
}
