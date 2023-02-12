package pages.fragrance;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class FragrancePage extends ProductCategoriesPage<FragrancePage> {
    public FragrancePage(WebDriver driver) {
        super(driver);
    }

    protected FragrancePage createProductCategoriesPage() {

        return new FragrancePage(getDriver());
    }
}
