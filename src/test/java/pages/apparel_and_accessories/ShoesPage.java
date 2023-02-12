package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class ShoesPage extends ProductsPage<ShoesPage> {
    public ShoesPage(WebDriver driver) {
        super(driver);
    }

    protected ShoesPage createProductsPage() {

        return new ShoesPage(getDriver());
    }
}
