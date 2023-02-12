package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class MenPage extends ProductsPage<MenPage> {

    public MenPage(WebDriver driver) {
        super(driver);
    }

    protected MenPage createProductsPage() {

        return new MenPage(getDriver());
    }
}
