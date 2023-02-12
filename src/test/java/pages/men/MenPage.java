package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class MenPage extends ProductCategoriesPage<MenPage> {

    public MenPage(WebDriver driver) {
        super(driver);
    }

    protected MenPage createProductCategoriesPage() {

        return new MenPage(getDriver());
    }
}
