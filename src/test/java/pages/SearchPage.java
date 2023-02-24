package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.MainPage;

import java.util.List;

public class SearchPage extends MainPage {

    @FindBy(xpath = "//input[@id='keyword']")
    private WebElement searchCriteriaField;

    @FindBy(xpath = "//a[@class ='prdocutname']")
    private List<WebElement> productList;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage clickSearchCriteriaField() {
        click(searchCriteriaField);

        return this;
    }

    public SearchPage inputSearchCriteria(String searchCriteria) {
        input(searchCriteria, searchCriteriaField);

        return new SearchPage(getDriver());
    }

    public List<WebElement> getProductNames() {

        return this.productList;
    }
}
