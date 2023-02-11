package pages.product_list.calvin_klein;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class CKOneShockForHimDeodorantPage extends ProductDescriptionPage {

    public CKOneShockForHimDeodorantPage(WebDriver driver) {
        super(driver);
    }

    protected CKOneShockForHimDeodorantPage createDescriptionPage() {

        return new CKOneShockForHimDeodorantPage(getDriver());
    }
}
