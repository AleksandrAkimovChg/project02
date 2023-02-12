package pages.fragrance;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class WomenPage extends ProductCategoriesPage<WomenPage> {

    public WomenPage(WebDriver driver) {
        super(driver);
    }

    protected WomenPage createProductCategoriesPage() {

        return new WomenPage(getDriver());
    }
}
