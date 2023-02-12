package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class EyesMakeupPage extends ProductCategoriesPage<EyesMakeupPage> {

    public EyesMakeupPage(WebDriver driver) {
        super(driver);
    }

    protected EyesMakeupPage createProductCategoriesPage() {

        return new EyesMakeupPage(getDriver());
    }
}
