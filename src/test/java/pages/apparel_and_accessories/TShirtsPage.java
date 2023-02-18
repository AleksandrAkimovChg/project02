package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base_abstract.ProductCategoriesPage;

import java.util.List;

public class TShirtsPage extends ProductCategoriesPage {
    @FindBy(xpath = "//div[@id= 'maincontainer']//div[@class = 'fixed']/a")
    public List<WebElement> productTitle;

    @FindBy(xpath = "//select[@id='sort']")
    private WebElement sortBy;

    @FindBy(xpath = "//select[@id='sort']/option[2]")
    private WebElement sortByAZ;

    @FindBy(xpath = "//select[@id='sort']/option[3]")
    private WebElement sortByZA;

    public TShirtsPage(WebDriver driver) {
        super(driver);
    }
    public List<String> getLinksText() {

        return getListText(productTitle);
    }

    public TShirtsPage clickSortBy(){
        click(sortBy);

        return new TShirtsPage(getDriver());
    }

    public TShirtsPage clickSortByAZ(){
        click(sortByAZ);

        return new TShirtsPage(getDriver());
    }

    public TShirtsPage clickSortByZA(){
        click(sortByZA);

        return new TShirtsPage(getDriver());
    }
}
