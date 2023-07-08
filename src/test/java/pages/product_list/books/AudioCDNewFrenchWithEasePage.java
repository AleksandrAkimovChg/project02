package pages.product_list.books;

import org.openqa.selenium.WebDriver;
import pages.product_list.DescriptionPage;

public class AudioCDNewFrenchWithEasePage extends DescriptionPage<AudioCDNewFrenchWithEasePage> {

    public AudioCDNewFrenchWithEasePage(WebDriver driver) {
        super(driver);
    }

    protected AudioCDNewFrenchWithEasePage createProductDescriptionPage() {

        return new AudioCDNewFrenchWithEasePage(getDriver());
    }
}
