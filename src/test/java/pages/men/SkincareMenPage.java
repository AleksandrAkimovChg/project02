package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class SkincareMenPage extends ProductsPage<SkincareMenPage> {

    public SkincareMenPage(WebDriver driver) {
        super(driver);
    }

    protected SkincareMenPage createProductsPage() {

        return new SkincareMenPage(getDriver());
    }
}
