package pages.home;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class SpecialsPage extends ProductsPage<SpecialsPage> {
    public SpecialsPage(WebDriver driver) {
        super(driver);
    }

    protected SpecialsPage createProductsPage() {

        return new SpecialsPage(getDriver());
    }
}
