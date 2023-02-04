package pages.home;

import org.openqa.selenium.WebDriver;
import pages.ITable;
import pages.base_abstract.MainPage;
import pages.home.cart.CartPage;

public class CheckoutPage extends MainPage implements ITable {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
}
