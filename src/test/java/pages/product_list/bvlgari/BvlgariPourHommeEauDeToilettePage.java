package pages.product_list.bvlgari;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class BvlgariPourHommeEauDeToilettePage extends DescriptionPage<BvlgariPourHommeEauDeToilettePage> {

    public BvlgariPourHommeEauDeToilettePage(WebDriver driver) {
        super(driver);
    }

    protected BvlgariPourHommeEauDeToilettePage createProductDescriptionPage() {

        return new BvlgariPourHommeEauDeToilettePage(getDriver());
    }
}
