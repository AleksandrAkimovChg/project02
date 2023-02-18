package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductsPage;
import java.util.List;

public class TShirtsPage extends ProductsPage<TShirtsPage> {

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    protected TShirtsPage createProductsPage() {

        return new TShirtsPage(getDriver());
    }
}
