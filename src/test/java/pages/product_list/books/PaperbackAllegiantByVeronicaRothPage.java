package pages.product_list.books;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class PaperbackAllegiantByVeronicaRothPage extends ProductDescriptionPage<PaperbackAllegiantByVeronicaRothPage> {

    public PaperbackAllegiantByVeronicaRothPage(WebDriver driver) {
        super(driver);
    }

    protected PaperbackAllegiantByVeronicaRothPage createProductDescriptionPage() {

        return new PaperbackAllegiantByVeronicaRothPage(getDriver());
    }
}
