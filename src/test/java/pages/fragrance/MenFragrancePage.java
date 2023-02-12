package pages.fragrance;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class MenFragrancePage extends ProductCategoriesPage<MenFragrancePage> {
    public MenFragrancePage(WebDriver driver) {
        super(driver);
    }

    protected MenFragrancePage createProductCategoriesPage() {

        return new MenFragrancePage(getDriver());
    }
}
