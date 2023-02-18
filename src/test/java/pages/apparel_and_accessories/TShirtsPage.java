package pages.apparel_and_accessories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductsPage;
import java.util.List;

public class TShirtsPage extends ProductsPage<TShirtsPage> {

    @FindBy(xpath = "//div[@id= 'maincontainer']//div[@class = 'fixed_wrapper']//a[@class = 'prdocutname']")
    private List<WebElement> productTitle;

    @FindBy(xpath = "//select[@id= 'sort']")
    private WebElement sortBy;

    @FindBy(xpath = "//select[@id= 'sort']/option[2]")
    private WebElement sortByAZ;

    @FindBy(xpath = "//select[@id= 'sort']/option[3]")
    private WebElement sortByZA;
    public TShirtsPage(WebDriver driver) {
        super(driver);
    }

    protected TShirtsPage createProductsPage() {

        return new TShirtsPage(getDriver());
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

    public TShirtsPage clickSortByZA() {
        click(sortByZA);

        return new TShirtsPage(getDriver());
    }
}
