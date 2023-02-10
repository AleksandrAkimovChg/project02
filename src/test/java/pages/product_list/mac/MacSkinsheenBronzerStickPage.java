package pages.product_list.mac;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.gucci.GucciGuiltyPage;

public class MacSkinsheenBronzerStickPage extends ProductDescriptionPage {

    public MacSkinsheenBronzerStickPage(WebDriver driver) {
        super(driver);
    }

    protected MacSkinsheenBronzerStickPage createDescriptionPage() {

        return new MacSkinsheenBronzerStickPage(getDriver());
    }
}
