package pages.product_list.books;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class PaperbackAllegiantByVeronicaRothPage extends DescriptionPage<PaperbackAllegiantByVeronicaRothPage> {

    public PaperbackAllegiantByVeronicaRothPage(WebDriver driver) {
        super(driver);
    }

    protected PaperbackAllegiantByVeronicaRothPage createProductDescriptionPage() {

        return new PaperbackAllegiantByVeronicaRothPage(getDriver());
    }
}
