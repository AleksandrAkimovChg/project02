package pages.product_list.sephora;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class SephoraSeaweedConditionerPage extends ProductDescriptionPage<SephoraSeaweedConditionerPage> {

    public SephoraSeaweedConditionerPage(WebDriver driver) {
        super(driver);
    }

    protected SephoraSeaweedConditionerPage createProductDescriptionPage() {

        return new SephoraSeaweedConditionerPage(getDriver());
    }
}
