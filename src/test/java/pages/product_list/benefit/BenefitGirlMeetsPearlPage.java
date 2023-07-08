package pages.product_list.benefit;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class BenefitGirlMeetsPearlPage extends DescriptionPage<BenefitGirlMeetsPearlPage> {
    public BenefitGirlMeetsPearlPage(WebDriver driver) {
        super(driver);
    }

    protected BenefitGirlMeetsPearlPage createProductDescriptionPage() {

        return new BenefitGirlMeetsPearlPage(getDriver());
    }
}
