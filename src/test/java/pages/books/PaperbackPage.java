package pages.books;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class PaperbackPage extends ProductCategoriesPage<PaperbackPage> {

    public PaperbackPage(WebDriver driver) {
        super(driver);
    }

    protected PaperbackPage createProductCategoriesPage() {

        return new PaperbackPage(getDriver());
    }
}
