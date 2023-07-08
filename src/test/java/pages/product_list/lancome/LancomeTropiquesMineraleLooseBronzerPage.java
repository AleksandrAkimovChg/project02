package pages.product_list.lancome;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class LancomeTropiquesMineraleLooseBronzerPage extends DescriptionPage<LancomeTropiquesMineraleLooseBronzerPage> {

    public LancomeTropiquesMineraleLooseBronzerPage(WebDriver driver) {
        super(driver);
    }

    protected LancomeTropiquesMineraleLooseBronzerPage createProductDescriptionPage() {

        return new LancomeTropiquesMineraleLooseBronzerPage(getDriver());
    }
}
