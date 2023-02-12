package pages.hair_care;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class ConditionerPage extends ProductCategoriesPage<ConditionerPage> {

    public ConditionerPage(WebDriver driver) {
        super(driver);
    }

    protected ConditionerPage createProductCategoriesPage() {

        return new ConditionerPage(getDriver());
    }
}
