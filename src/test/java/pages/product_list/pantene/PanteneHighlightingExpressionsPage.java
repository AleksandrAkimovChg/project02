package pages.product_list.pantene;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class PanteneHighlightingExpressionsPage extends DescriptionPage<PanteneHighlightingExpressionsPage> {

    public PanteneHighlightingExpressionsPage(WebDriver driver) {
        super(driver);
    }

    protected PanteneHighlightingExpressionsPage createProductDescriptionPage() {

        return new PanteneHighlightingExpressionsPage(getDriver());
    }
}
