package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class BodyAndShowerPage extends ProductsPage<BodyAndShowerPage> {
    public BodyAndShowerPage(WebDriver driver) {
        super(driver);
    }

    protected BodyAndShowerPage createProductsPage() {

        return new BodyAndShowerPage(getDriver());
    }
}
