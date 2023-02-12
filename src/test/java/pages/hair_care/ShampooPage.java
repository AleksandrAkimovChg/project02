package pages.hair_care;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class ShampooPage extends ProductCategoriesPage<ShampooPage> {

    public ShampooPage(WebDriver driver) {
        super(driver);
    }

    protected ShampooPage createProductCategoriesPage() {

        return new ShampooPage(getDriver());
    }
}
