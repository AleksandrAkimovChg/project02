package pages.product_list.benefit;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class BenefitBellaBambaPage extends ProductDescriptionPage {

    public BenefitBellaBambaPage(WebDriver driver) {
        super(driver);
    }

    protected BenefitBellaBambaPage createDescriptionPage() {

        return new BenefitBellaBambaPage(getDriver());
    }
}
