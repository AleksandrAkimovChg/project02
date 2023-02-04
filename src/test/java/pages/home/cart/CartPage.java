package pages.home.cart;

import org.openqa.selenium.WebDriver;
import pages.ITable;
import pages.base_abstract.FormPage;

public class CartPage extends FormPage implements ITable {
    public CartPage(WebDriver driver) {
        super(driver);
    }
}
