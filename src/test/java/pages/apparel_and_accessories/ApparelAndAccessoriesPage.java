package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;
import pages.product_list.NewLadies_Sandals_ID116_Page;
import pages.product_list.WomensStilettoSandals_ID118_Page;

public class ApparelAndAccessoriesPage extends ProductsPage<ApparelAndAccessoriesPage> {
    public ApparelAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    protected ApparelAndAccessoriesPage createProductsPage() {

        return new ApparelAndAccessoriesPage(getDriver());
    }

    public NewLadies_Sandals_ID116_Page clickNewLadiesSandals() {
        clickGridProduct1();

        return new NewLadies_Sandals_ID116_Page(getDriver());
    }

    public WomensStilettoSandals_ID118_Page clickWomensStilettoSandals() {
        clickGridProduct2();

        return new WomensStilettoSandals_ID118_Page(getDriver());
    }
}
