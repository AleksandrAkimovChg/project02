package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class FragranceSetsPage extends ProductsPage<FragranceSetsPage> {

    public FragranceSetsPage(WebDriver driver) {
        super(driver);
    }

    protected FragranceSetsPage createProductsPage() {

        return new FragranceSetsPage(getDriver());
    }
}
