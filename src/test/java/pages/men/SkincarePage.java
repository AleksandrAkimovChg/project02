package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class SkincarePage extends ProductsPage<SkincarePage> {

    public SkincarePage(WebDriver driver) {
        super(driver);
    }

    protected SkincarePage createProductsPage() {

        return new SkincarePage(getDriver());
    }
}
