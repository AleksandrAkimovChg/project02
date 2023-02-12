package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class NailsPage extends ProductCategoriesPage<NailsPage> {
    public NailsPage(WebDriver driver) {
        super(driver);
    }

    protected NailsPage createProductCategoriesPage() {

        return new NailsPage(getDriver());
    }
}
