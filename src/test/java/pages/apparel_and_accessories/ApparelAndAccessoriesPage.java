package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductCategoriesPage;
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
