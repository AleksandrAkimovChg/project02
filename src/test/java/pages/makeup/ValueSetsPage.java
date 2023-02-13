package pages.makeup;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class ValueSetsPage extends ProductsPage<ValueSetsPage> {

    public ValueSetsPage(WebDriver driver) {
        super(driver);
    }

    protected ValueSetsPage createProductsPage() {

        return new ValueSetsPage(getDriver());
    }
}
