package pages.product_list.books;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class AudioCDNewFrenchWithEasePage extends ProductDescriptionPage {

    public AudioCDNewFrenchWithEasePage(WebDriver driver) {
        super(driver);
    }

    protected AudioCDNewFrenchWithEasePage createDescriptionPage() {

        return new AudioCDNewFrenchWithEasePage(getDriver());
    }
}
