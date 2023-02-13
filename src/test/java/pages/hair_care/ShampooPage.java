package pages.hair_care;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class ShampooPage extends ProductsPage<ShampooPage> {

    public ShampooPage(WebDriver driver) {
        super(driver);
    }

    protected ShampooPage createProductsPage() {

        return new ShampooPage(getDriver());
    }
}
