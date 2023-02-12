package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class FaceMakeupPage extends ProductsPage<FaceMakeupPage> {

    public FaceMakeupPage(WebDriver driver) {
        super(driver);
    }

    protected FaceMakeupPage createProductsPage() {

        return new FaceMakeupPage(getDriver());
    }
}
