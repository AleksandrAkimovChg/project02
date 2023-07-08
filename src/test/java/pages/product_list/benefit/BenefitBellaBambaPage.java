package pages.product_list.benefit;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class BenefitBellaBambaPage extends DescriptionPage<BenefitBellaBambaPage> {

    public BenefitBellaBambaPage(WebDriver driver) {
        super(driver);
    }

    protected BenefitBellaBambaPage createProductDescriptionPage() {

        return new BenefitBellaBambaPage(getDriver());
    }
}
