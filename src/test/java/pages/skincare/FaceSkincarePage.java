package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class FaceSkincarePage extends ProductCategoriesPage<FaceSkincarePage> {

    public FaceSkincarePage(WebDriver driver) {
        super(driver);
    }

    protected FaceSkincarePage createProductCategoriesPage() {

        return new FaceSkincarePage(getDriver());
    }
}
