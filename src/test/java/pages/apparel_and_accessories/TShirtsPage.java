package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class TShirtsPage extends ProductCategoriesPage<TShirtsPage> {

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    protected TShirtsPage createProductCategoriesPage() {

        return new TShirtsPage(getDriver());
    }
}
