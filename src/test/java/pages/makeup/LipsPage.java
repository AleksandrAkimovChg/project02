package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class LipsPage extends ProductCategoriesPage<LipsPage> {

    public LipsPage(WebDriver driver) {
        super(driver);
    }

    protected LipsPage createProductCategoriesPage() {

        return new LipsPage(getDriver());
    }
}
