package pages.fragrance;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class WomenPage extends ProductsPage<WomenPage> {

    public WomenPage(WebDriver driver) {
        super(driver);
    }

    protected WomenPage createProductsPage() {

        return new WomenPage(getDriver());
    }
}
