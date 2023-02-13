package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class MakeupPage extends ProductsPage<MakeupPage> {

    public MakeupPage(WebDriver driver) {
        super(driver);
    }

    protected MakeupPage createProductsPage() {

        return new MakeupPage(getDriver());
    }
}
