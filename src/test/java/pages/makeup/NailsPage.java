package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class NailsPage extends ProductsPage<NailsPage> {
    public NailsPage(WebDriver driver) {
        super(driver);
    }

    protected NailsPage createProductsPage() {

        return new NailsPage(getDriver());
    }
}
