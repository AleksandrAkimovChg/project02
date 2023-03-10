package pages.product_list.giorgio_armani;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class GiorgioArmaniCodePourFemmePage extends ProductDescriptionPage<GiorgioArmaniCodePourFemmePage> {

    public GiorgioArmaniCodePourFemmePage(WebDriver driver) {
        super(driver);
    }

    protected GiorgioArmaniCodePourFemmePage createProductDescriptionPage() {

        return new GiorgioArmaniCodePourFemmePage(getDriver());
    }
}
