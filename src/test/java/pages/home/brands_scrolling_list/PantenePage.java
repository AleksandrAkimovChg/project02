package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class PantenePage extends ProductsPage<PantenePage> {

    public PantenePage(WebDriver driver) {
        super(driver);
    }

    protected PantenePage createProductsPage() {

        return new PantenePage(getDriver());
    }
}
