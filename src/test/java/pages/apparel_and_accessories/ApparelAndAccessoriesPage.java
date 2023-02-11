package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;
import pages.product_list.NewLadies_Sandals_ID116_Page;

public class ApparelAndAccessoriesPage extends ProductCategoriesPage {


    public ApparelAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public NewLadies_Sandals_ID116_Page clickNewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandals() {
        clickGridProduct_1();

        return new NewLadies_Sandals_ID116_Page(getDriver());
    }
}
