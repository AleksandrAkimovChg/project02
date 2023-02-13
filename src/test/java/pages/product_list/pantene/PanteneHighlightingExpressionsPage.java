package pages.product_list.pantene;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class PanteneHighlightingExpressionsPage extends ProductDescriptionPage<PanteneHighlightingExpressionsPage> {

    public PanteneHighlightingExpressionsPage(WebDriver driver) {
        super(driver);
    }

    protected PanteneHighlightingExpressionsPage createProductDescriptionPage() {

        return new PanteneHighlightingExpressionsPage(getDriver());
    }
}
