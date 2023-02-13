package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class EyesMakeupPage extends ProductsPage<EyesMakeupPage> {

    public EyesMakeupPage(WebDriver driver) {
        super(driver);
    }

    protected EyesMakeupPage createProductsPage() {

        return new EyesMakeupPage(getDriver());
    }
}
