package pages.books;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;

public class AudioCDPage extends ProductCategoriesPage<AudioCDPage> {

    public AudioCDPage(WebDriver driver) {
        super(driver);
    }

    protected AudioCDPage createProductCategoriesPage() {

        return new AudioCDPage(getDriver());
    }
}
