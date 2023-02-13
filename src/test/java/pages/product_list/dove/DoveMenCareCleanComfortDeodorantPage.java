package pages.product_list.dove;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class DoveMenCareCleanComfortDeodorantPage extends ProductDescriptionPage {

    public DoveMenCareCleanComfortDeodorantPage(WebDriver driver) {
        super(driver);
    }

    protected DoveMenCareCleanComfortDeodorantPage createProductDescriptionPage() {

        return new DoveMenCareCleanComfortDeodorantPage(getDriver());
    }
}
