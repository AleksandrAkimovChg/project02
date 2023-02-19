package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.MainPage;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends MainPage {

    @FindBy(xpath = "//*[@id='keyword']")
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

    public List<String> getFilteredProductNames(String searchCriteria) {
        return getProductNames()
                .stream()
                .map(WebElement::getText)
                .filter(name -> !name.isBlank() && (name.contains(" " + searchCriteria + " ")))
                .collect(Collectors.toList());
    }
}
