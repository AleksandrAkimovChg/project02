package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class GucciPage extends ProductsPage<GucciPage> {
    public GucciPage(WebDriver driver) {
        super(driver);
    }

    protected GucciPage createProductsPage() {

        return new GucciPage(getDriver());
    }
}
