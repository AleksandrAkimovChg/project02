package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductCategoriesPage;
import pages.home.account.AccountLoginPage;
import pages.product_list.NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage;

public class ApparelAndAccessoriesPage extends ProductCategoriesPage {

    public ApparelAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage clickNewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandals() {
        clickGridProduct_1();

        return new NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage(getDriver());
    }

}
