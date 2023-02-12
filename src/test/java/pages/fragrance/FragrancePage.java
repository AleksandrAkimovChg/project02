package pages.fragrance;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class FragrancePage extends ProductsPage<FragrancePage> {
    public FragrancePage(WebDriver driver) {
        super(driver);
    }

    protected FragrancePage createProductsPage() {

        return new FragrancePage(getDriver());
    }
}
