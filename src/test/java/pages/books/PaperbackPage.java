package pages.books;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class PaperbackPage extends ProductsPage<PaperbackPage> {

    public PaperbackPage(WebDriver driver) {
        super(driver);
    }

    protected PaperbackPage createProductsPage() {

        return new PaperbackPage(getDriver());
    }
}
