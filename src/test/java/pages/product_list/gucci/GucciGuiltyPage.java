package pages.product_list.gucci;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class GucciGuiltyPage extends ProductDescriptionPage<GucciGuiltyPage> {

    public GucciGuiltyPage(WebDriver driver) {
        super(driver);
    }

    protected GucciGuiltyPage createProductDescriptionPage() {

        return new GucciGuiltyPage(getDriver());
    }
}
