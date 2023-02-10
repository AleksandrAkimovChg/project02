package pages.product_list.giorgio_armani;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.calvin_klein.CKOneShockForHimDeodorantPage;

public class GiorgioArmaniCodePourFemmePage extends ProductDescriptionPage {

    public GiorgioArmaniCodePourFemmePage(WebDriver driver) {
        super(driver);
    }

    protected GiorgioArmaniCodePourFemmePage createDescriptionPage() {

        return new GiorgioArmaniCodePourFemmePage(getDriver());
    }
}
