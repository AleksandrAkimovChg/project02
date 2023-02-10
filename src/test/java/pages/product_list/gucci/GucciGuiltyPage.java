package pages.product_list.gucci;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.calvin_klein.CKOneShockForHimDeodorantPage;

public class GucciGuiltyPage extends ProductDescriptionPage {

    public GucciGuiltyPage(WebDriver driver) {
        super(driver);
    }

    protected GucciGuiltyPage createDescriptionPage() {

        return new GucciGuiltyPage(getDriver());
    }
}
