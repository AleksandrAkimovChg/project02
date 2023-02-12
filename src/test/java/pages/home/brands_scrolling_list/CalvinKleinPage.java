package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class CalvinKleinPage extends ProductsPage<CalvinKleinPage> {

    public CalvinKleinPage(WebDriver driver) {
        super(driver);
    }

    protected CalvinKleinPage createProductsPage() {

        return new CalvinKleinPage(getDriver());
    }
}
