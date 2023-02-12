package pages.skincare;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class GiftIdeasAndSetsPage extends ProductsPage<GiftIdeasAndSetsPage> {

    public GiftIdeasAndSetsPage(WebDriver driver) {
        super(driver);
    }

    protected GiftIdeasAndSetsPage createProductsPage() {

        return new GiftIdeasAndSetsPage(getDriver());
    }
}
