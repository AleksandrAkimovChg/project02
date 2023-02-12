package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.MainPage;
import pages.base_abstract.ProductCategoriesPage;

public class SkincarePage extends ProductCategoriesPage<SkincarePage> {

    public SkincarePage(WebDriver driver) {
        super(driver);
    }

    protected SkincarePage createProductCategoriesPage() {

        return new SkincarePage(getDriver());
    }
}
