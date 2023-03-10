package pages.product_list.bvlgari;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class BvlgariPourHommeEauDeToilettePage extends ProductDescriptionPage<BvlgariPourHommeEauDeToilettePage> {

    public BvlgariPourHommeEauDeToilettePage(WebDriver driver) {
        super(driver);
    }

    protected BvlgariPourHommeEauDeToilettePage createProductDescriptionPage() {

        return new BvlgariPourHommeEauDeToilettePage(getDriver());
    }
}
