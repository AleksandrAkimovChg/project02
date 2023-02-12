package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class MacPage extends ProductsPage<MacPage> {

    public MacPage(WebDriver driver) {
        super(driver);
    }

    protected MacPage createProductsPage() {

        return new MacPage(getDriver());
    }
}
