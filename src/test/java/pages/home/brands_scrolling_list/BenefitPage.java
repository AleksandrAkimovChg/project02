package pages.home.brands_scrolling_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class BenefitPage extends ProductsPage<BenefitPage> {

    public BenefitPage(WebDriver driver) {
        super(driver);
    }

    protected BenefitPage createProductsPage() {

        return new BenefitPage(getDriver());
    }
}
