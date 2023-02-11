package pages.product_list.sephora;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class SephoraSeaweedConditionerPage extends ProductDescriptionPage {

    public SephoraSeaweedConditionerPage(WebDriver driver) {
        super(driver);
    }

    protected SephoraSeaweedConditionerPage createDescriptionPage() {

        return new SephoraSeaweedConditionerPage(getDriver());
    }
}
