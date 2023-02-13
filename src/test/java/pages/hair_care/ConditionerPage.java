package pages.hair_care;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class ConditionerPage extends ProductsPage<ConditionerPage> {

    public ConditionerPage(WebDriver driver) {
        super(driver);
    }

    protected ConditionerPage createProductsPage() {

        return new ConditionerPage(getDriver());
    }
}
