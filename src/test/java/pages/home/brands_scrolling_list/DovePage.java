package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class DovePage extends ProductsPage<DovePage> {

    public DovePage(WebDriver driver) {
        super(driver);
    }

    protected DovePage createProductsPage() {

        return new DovePage(getDriver());
    }
}
