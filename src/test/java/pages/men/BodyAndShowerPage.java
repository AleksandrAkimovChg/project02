package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class BodyAndShowerPage extends ProductCategoriesPage<BodyAndShowerPage> {
    public BodyAndShowerPage(WebDriver driver) {
        super(driver);
    }

    protected BodyAndShowerPage createProductCategoriesPage() {

        return new BodyAndShowerPage(getDriver());
    }
}
