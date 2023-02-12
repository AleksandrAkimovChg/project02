package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class HandsAndNailsPage extends ProductCategoriesPage<HandsAndNailsPage> {

    public HandsAndNailsPage(WebDriver driver) {
        super(driver);
    }

    protected HandsAndNailsPage createProductCategoriesPage() {

        return new HandsAndNailsPage(getDriver());
    }
}
