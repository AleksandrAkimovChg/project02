package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class GiftIdeasAndSetsPage extends ProductCategoriesPage<GiftIdeasAndSetsPage> {

    public GiftIdeasAndSetsPage(WebDriver driver) {
        super(driver);
    }

    protected GiftIdeasAndSetsPage createProductCategoriesPage() {

        return new GiftIdeasAndSetsPage(getDriver());
    }
}
