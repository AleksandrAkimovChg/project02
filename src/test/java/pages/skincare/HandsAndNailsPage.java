package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class HandsAndNailsPage extends ProductsPage<HandsAndNailsPage> {

    public HandsAndNailsPage(WebDriver driver) {
        super(driver);
    }

    protected HandsAndNailsPage createProductsPage() {

        return new HandsAndNailsPage(getDriver());
    }
}
