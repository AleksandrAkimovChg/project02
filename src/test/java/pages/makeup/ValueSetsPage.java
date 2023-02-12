package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class ValueSetsPage extends ProductCategoriesPage<ValueSetsPage> {

    public ValueSetsPage(WebDriver driver) {
        super(driver);
    }

    protected ValueSetsPage createProductCategoriesPage() {

        return new ValueSetsPage(getDriver());
    }
}
