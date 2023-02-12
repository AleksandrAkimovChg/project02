package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class BvlgariPage extends ProductsPage<BvlgariPage> {
    public BvlgariPage(WebDriver driver) {
        super(driver);
    }

    protected BvlgariPage createProductsPage() {

        return new BvlgariPage(getDriver());
    }
}
