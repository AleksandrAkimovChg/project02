package pages.product_list.calvin_klein;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class CKOneShockForHimDeodorantPage extends DescriptionPage<CKOneShockForHimDeodorantPage> {

    public CKOneShockForHimDeodorantPage(WebDriver driver) {
        super(driver);
    }

    protected CKOneShockForHimDeodorantPage createProductDescriptionPage() {

        return new CKOneShockForHimDeodorantPage(getDriver());
    }
}
