package pages.product_list.sephora;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.calvin_klein.CKOneShockForHimDeodorantPage;

public class SephoraSeaweedConditionerPage extends ProductDescriptionPage {

    public SephoraSeaweedConditionerPage(WebDriver driver) {
        super(driver);
    }

    protected SephoraSeaweedConditionerPage createDescriptionPage() {

        return new SephoraSeaweedConditionerPage(getDriver());
    }
}
