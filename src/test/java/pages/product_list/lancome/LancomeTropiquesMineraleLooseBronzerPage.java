package pages.product_list.lancome;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.calvin_klein.CKOneShockForHimDeodorantPage;

public class LancomeTropiquesMineraleLooseBronzerPage extends ProductDescriptionPage {

    public LancomeTropiquesMineraleLooseBronzerPage(WebDriver driver) {
        super(driver);
    }

    protected LancomeTropiquesMineraleLooseBronzerPage createDescriptionPage() {

        return new LancomeTropiquesMineraleLooseBronzerPage(getDriver());
    }
}
