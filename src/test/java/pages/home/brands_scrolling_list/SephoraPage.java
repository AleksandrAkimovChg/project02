package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class SephoraPage extends ProductsPage<SephoraPage> {

    public SephoraPage(WebDriver driver) {
        super(driver);
    }

    protected SephoraPage createProductsPage() {

        return new SephoraPage(getDriver());
    }
}
