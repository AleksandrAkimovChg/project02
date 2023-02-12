package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;
import pages.product_list.NewLadies_Sandals_ID116_Page;

public class ApparelAndAccessoriesPage extends ProductCategoriesPage<ApparelAndAccessoriesPage> {


    public ApparelAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    protected ApparelAndAccessoriesPage createProductCategoriesPage() {

        return new ApparelAndAccessoriesPage(getDriver());
    }

    public NewLadies_Sandals_ID116_Page clickNewLadiesSandals() {
        clickGridProduct_1();

        return new NewLadies_Sandals_ID116_Page(getDriver());
    }
}
