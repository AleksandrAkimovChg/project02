package pages.product_list.dove;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;
import pages.product_list.calvin_klein.CKOneShockForHimDeodorantPage;

public class DoveMenCareCleanComfortDeodorantPage extends ProductDescriptionPage {

    public DoveMenCareCleanComfortDeodorantPage(WebDriver driver) {
        super(driver);
    }

    protected DoveMenCareCleanComfortDeodorantPage createDescriptionPage() {

        return new DoveMenCareCleanComfortDeodorantPage(getDriver());
    }
}
