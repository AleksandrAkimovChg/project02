package pages.product_list.pantene;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.calvin_klein.CKOneShockForHimDeodorantPage;

public class PanteneCurlsToStraightShampooPage extends ProductDescriptionPage {

    public PanteneCurlsToStraightShampooPage(WebDriver driver) {
        super(driver);
    }

    protected PanteneCurlsToStraightShampooPage createDescriptionPage() {

        return new PanteneCurlsToStraightShampooPage(getDriver());
    }
}
