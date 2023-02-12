package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class FaceMakeupPage extends ProductCategoriesPage<FaceMakeupPage> {

    public FaceMakeupPage(WebDriver driver) {
        super(driver);
    }

    protected FaceMakeupPage createProductCategoriesPage() {

        return new FaceMakeupPage(getDriver());
    }
}
