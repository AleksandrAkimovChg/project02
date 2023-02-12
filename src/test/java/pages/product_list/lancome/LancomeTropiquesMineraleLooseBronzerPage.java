package pages.product_list.lancome;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class LancomeTropiquesMineraleLooseBronzerPage extends ProductDescriptionPage<LancomeTropiquesMineraleLooseBronzerPage> {

    public LancomeTropiquesMineraleLooseBronzerPage(WebDriver driver) {
        super(driver);
    }

    protected LancomeTropiquesMineraleLooseBronzerPage createProductDescriptionPage() {

        return new LancomeTropiquesMineraleLooseBronzerPage(getDriver());
    }
}
