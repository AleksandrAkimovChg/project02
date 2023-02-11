package pages.product_list.mac;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class MacSkinsheenBronzerStickPage extends ProductDescriptionPage {

    public MacSkinsheenBronzerStickPage(WebDriver driver) {
        super(driver);
    }

    protected MacSkinsheenBronzerStickPage createProductDescriptionPage() {

        return new MacSkinsheenBronzerStickPage(getDriver());
    }
}
