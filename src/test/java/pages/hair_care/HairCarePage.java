package pages.hair_care;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class HairCarePage extends ProductsPage<HairCarePage> {
    public HairCarePage(WebDriver driver) {
        super(driver);
    }

    protected HairCarePage createProductsPage() {

        return new HairCarePage(getDriver());
    }
}
