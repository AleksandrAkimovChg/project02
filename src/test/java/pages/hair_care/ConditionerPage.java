package pages.hair_care;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductsPage;

import java.util.List;

public class ConditionerPage extends ProductsPage<ConditionerPage> {

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 col-xs-12']//a[@class='prdocutname']")
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

    public List<WebElement> getConditionersList2() {
        return conditionersList;
    }

    public SeaweedConditionerProductPage clickOnConditionerByName(String nameProduct) {
        for (int i = 0; i < getConditionersList2().size(); i++) {
            if(getConditionersList2().get(i).getText().equalsIgnoreCase(nameProduct)) {
                getConditionersList2().get(i).click();
            }
        }
        return new SeaweedConditionerProductPage(getDriver());
    }

    public ConditionerPage mouseHoverAndClickAddToCard() {
        mouseHoverAndClick(addToCardProduct73);

        return new ConditionerPage(getDriver());
    }
}
