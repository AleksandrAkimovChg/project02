package pages.product_list;

import org.openqa.selenium.WebDriver;

public class WomensStilettoSandals_ID118_Page extends ProductDescriptionPage<WomensStilettoSandals_ID118_Page> {

    public WomensStilettoSandals_ID118_Page(WebDriver driver) {
        super(driver);
    }

    protected WomensStilettoSandals_ID118_Page createProductDescriptionPage() {

        return new WomensStilettoSandals_ID118_Page(getDriver());
    }
}
