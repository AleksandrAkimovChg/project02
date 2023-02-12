package pages.books;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class BooksPage extends ProductsPage<BooksPage> {

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    protected BooksPage createProductsPage() {

        return new BooksPage(getDriver());
    }
}
