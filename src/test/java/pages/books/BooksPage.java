package pages.books;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class BooksPage extends ProductCategoriesPage<BooksPage> {

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    protected BooksPage createProductCategoriesPage() {

        return new BooksPage(getDriver());
    }
}
