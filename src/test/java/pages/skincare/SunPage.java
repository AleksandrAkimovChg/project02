package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class SunPage extends ProductsPage<SunPage> {

    public SunPage(WebDriver driver) {
        super(driver);
    }

    protected SunPage createProductsPage() {

        return new SunPage(getDriver());
    }
}
