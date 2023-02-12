package pages.books;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;

public class AudioCDPage extends ProductsPage<AudioCDPage> {

    public AudioCDPage(WebDriver driver) {
        super(driver);
    }

    protected AudioCDPage createProductsPage() {

        return new AudioCDPage(getDriver());
    }
}
