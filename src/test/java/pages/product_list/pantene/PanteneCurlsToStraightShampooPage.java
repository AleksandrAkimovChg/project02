package pages.product_list.pantene;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class PanteneCurlsToStraightShampooPage extends DescriptionPage<PanteneCurlsToStraightShampooPage> {

    public PanteneCurlsToStraightShampooPage(WebDriver driver) {
        super(driver);
    }

    protected PanteneCurlsToStraightShampooPage createProductDescriptionPage() {

        return new PanteneCurlsToStraightShampooPage(getDriver());
    }
}
