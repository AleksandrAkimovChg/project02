package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class PreShaveAndShavingPage extends ProductCategoriesPage<PreShaveAndShavingPage> {

    public PreShaveAndShavingPage(WebDriver driver) {
        super(driver);
    }

    protected PreShaveAndShavingPage createProductCategoriesPage() {

        return new PreShaveAndShavingPage(getDriver());
    }
}
