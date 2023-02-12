package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class MakeupPage extends ProductCategoriesPage<MakeupPage> {

    public MakeupPage(WebDriver driver) {
        super(driver);
    }

    protected MakeupPage createProductCategoriesPage() {

        return new MakeupPage(getDriver());
    }
}
