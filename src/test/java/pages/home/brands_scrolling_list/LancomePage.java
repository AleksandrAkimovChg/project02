package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class LancomePage extends ProductsPage {

    public LancomePage(WebDriver driver) {
        super(driver);
    }

    protected LancomePage createProductsPage() {

        return new LancomePage(getDriver());
    }
}
