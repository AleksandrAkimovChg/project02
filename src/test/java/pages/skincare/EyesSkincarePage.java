package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class EyesSkincarePage extends ProductsPage<EyesSkincarePage> {

    public EyesSkincarePage(WebDriver driver) {
        super(driver);
    }

    protected EyesSkincarePage createProductsPage() {

        return new EyesSkincarePage(getDriver());
    }
}
