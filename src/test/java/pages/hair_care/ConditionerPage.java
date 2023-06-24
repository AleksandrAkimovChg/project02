package pages.hair_care;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductsPage;

import java.util.List;

public class ConditionerPage extends ProductsPage<ConditionerPage> {

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 col-xs-12']")
    private List<WebElement> conditionersList;

    @FindBy(xpath = "//a[@data-id='73']")
    private WebElement addToCardProduct73;

    public ConditionerPage(WebDriver driver) {
        super(driver);
    }

    protected ConditionerPage createProductsPage() {

        return new ConditionerPage(getDriver());
    }

    public List<String> getConditionersList() {

        return getListText(conditionersList);
    }

    public ConditionerPage mouseHoverAndClickAddToCard() {
        mouseHoverAndClick(addToCardProduct73);

        return new ConditionerPage(getDriver());
    }
}
