package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class SunPage extends ProductCategoriesPage<SunPage> {

    public SunPage(WebDriver driver) {
        super(driver);
    }

    protected SunPage createProductCategoriesPage() {

        return new SunPage(getDriver());
    }
}
