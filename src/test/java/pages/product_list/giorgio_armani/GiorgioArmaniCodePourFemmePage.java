package pages.product_list.giorgio_armani;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class GiorgioArmaniCodePourFemmePage extends DescriptionPage<GiorgioArmaniCodePourFemmePage> {

    public GiorgioArmaniCodePourFemmePage(WebDriver driver) {
        super(driver);
    }

    protected GiorgioArmaniCodePourFemmePage createProductDescriptionPage() {

        return new GiorgioArmaniCodePourFemmePage(getDriver());
    }
}
