package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class TShirtsPage extends ProductsPage<TShirtsPage> {

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    protected TShirtsPage createProductsPage() {

        return new TShirtsPage(getDriver());
    }
}
