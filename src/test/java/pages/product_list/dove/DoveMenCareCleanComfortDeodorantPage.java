package pages.product_list.dove;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class DoveMenCareCleanComfortDeodorantPage extends DescriptionPage<DoveMenCareCleanComfortDeodorantPage> {

    public DoveMenCareCleanComfortDeodorantPage(WebDriver driver) {
        super(driver);
    }

    protected DoveMenCareCleanComfortDeodorantPage createProductDescriptionPage() {

        return new DoveMenCareCleanComfortDeodorantPage(getDriver());
    }
}
