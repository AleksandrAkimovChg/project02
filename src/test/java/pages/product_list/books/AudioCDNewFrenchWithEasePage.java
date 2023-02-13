package pages.product_list.books;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class AudioCDNewFrenchWithEasePage extends ProductDescriptionPage<AudioCDNewFrenchWithEasePage> {

    public AudioCDNewFrenchWithEasePage(WebDriver driver) {
        super(driver);
    }

    protected AudioCDNewFrenchWithEasePage createProductDescriptionPage() {

        return new AudioCDNewFrenchWithEasePage(getDriver());
    }
}
