package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class EyesSkincarePage extends ProductCategoriesPage<EyesSkincarePage> {

    public EyesSkincarePage(WebDriver driver) {
        super(driver);
    }

    protected EyesSkincarePage createProductCategoriesPage() {

        return new EyesSkincarePage(getDriver());
    }
}
