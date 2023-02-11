package pages.product_list;

import org.openqa.selenium.WebDriver;

public class NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage extends ProductDescriptionPage {

    public NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage(WebDriver driver) {
        super(driver);
    }

    protected NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage createProductDescriptionPage() {

        return new NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage(getDriver());
    }
}
