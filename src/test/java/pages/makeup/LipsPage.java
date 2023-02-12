package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class LipsPage extends ProductsPage<LipsPage> {

    public LipsPage(WebDriver driver) {
        super(driver);
    }

    protected LipsPage createProductsPage() {

        return new LipsPage(getDriver());
    }
}
