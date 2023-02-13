package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class FaceSkincarePage extends ProductsPage<FaceSkincarePage> {

    public FaceSkincarePage(WebDriver driver) {
        super(driver);
    }

    protected FaceSkincarePage createProductsPage() {

        return new FaceSkincarePage(getDriver());
    }
}
