package pages.product_list;

import org.openqa.selenium.WebDriver;

public class NewLadies_Sandals_ID116_Page extends DescriptionPage<NewLadies_Sandals_ID116_Page> {

    public NewLadies_Sandals_ID116_Page(WebDriver driver) {
        super(driver);
    }

    protected NewLadies_Sandals_ID116_Page createProductDescriptionPage() {

        return new NewLadies_Sandals_ID116_Page(getDriver());
    }
}
