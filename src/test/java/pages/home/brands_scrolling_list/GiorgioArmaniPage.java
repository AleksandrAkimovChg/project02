package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class GiorgioArmaniPage extends ProductsPage<GiorgioArmaniPage> {

    public GiorgioArmaniPage(WebDriver driver) {
        super(driver);
    }

    protected GiorgioArmaniPage createProductsPage() {

        return new GiorgioArmaniPage(getDriver());
    }
}
