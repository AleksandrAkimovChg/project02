package pages.product_list.bvlgari;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class BvlgariPourHommeEauDeToilettePage extends ProductDescriptionPage {

    public BvlgariPourHommeEauDeToilettePage(WebDriver driver) {
        super(driver);
    }

    protected BvlgariPourHommeEauDeToilettePage createDescriptionPage() {

        return new BvlgariPourHommeEauDeToilettePage(getDriver());
    }
}
