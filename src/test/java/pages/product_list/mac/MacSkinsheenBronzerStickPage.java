package pages.product_list.mac;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class MacSkinsheenBronzerStickPage extends DescriptionPage<MacSkinsheenBronzerStickPage> {

    public MacSkinsheenBronzerStickPage(WebDriver driver) {
        super(driver);
    }

    protected MacSkinsheenBronzerStickPage createProductDescriptionPage() {

        return new MacSkinsheenBronzerStickPage(getDriver());
    }
}
