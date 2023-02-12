package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class PreShaveAndShavingPage extends ProductsPage<PreShaveAndShavingPage> {

    public PreShaveAndShavingPage(WebDriver driver) {
        super(driver);
    }

    protected PreShaveAndShavingPage createProductsPage() {

        return new PreShaveAndShavingPage(getDriver());
    }
}
