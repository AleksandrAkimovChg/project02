package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class ShoesPage extends ProductCategoriesPage<ShoesPage> {
    public ShoesPage(WebDriver driver) {
        super(driver);
    }

    protected ShoesPage createProductCategoriesPage() {

        return new ShoesPage(getDriver());
    }
}
