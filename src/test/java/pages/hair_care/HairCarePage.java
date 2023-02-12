package pages.hair_care;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class HairCarePage extends ProductCategoriesPage<HairCarePage> {
    public HairCarePage(WebDriver driver) {
        super(driver);
    }

    protected HairCarePage createProductCategoriesPage() {

        return new HairCarePage(getDriver());
    }
}
