package pages.product_list.sephora;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class SephoraSeaweedConditionerPage extends DescriptionPage<SephoraSeaweedConditionerPage> {

    public SephoraSeaweedConditionerPage(WebDriver driver) {
        super(driver);
    }

    protected SephoraSeaweedConditionerPage createProductDescriptionPage() {

        return new SephoraSeaweedConditionerPage(getDriver());
    }
}
