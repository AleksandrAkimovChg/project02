package pages.fragrance;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class MenFragrancePage extends ProductsPage<MenFragrancePage> {
    public MenFragrancePage(WebDriver driver) {
        super(driver);
    }

    protected MenFragrancePage createProductsPage() {

        return new MenFragrancePage(getDriver());
    }
}
