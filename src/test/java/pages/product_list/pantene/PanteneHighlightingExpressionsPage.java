package pages.product_list.pantene;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.books.PaperbackAllegiantByVeronicaRothPage;

public class PanteneHighlightingExpressionsPage extends ProductDescriptionPage {

    public PanteneHighlightingExpressionsPage(WebDriver driver) {
        super(driver);
    }

    protected PanteneHighlightingExpressionsPage createProductDescriptionPage() {

        return new PanteneHighlightingExpressionsPage(getDriver());
    }
}
