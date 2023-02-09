package pages.makeup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductCategoriesPage;

public class CheeksPage extends ProductCategoriesPage {

    private static final String PRICETAG = "//div[@class='pricetag jumbotron']";

    @FindBy(xpath = PRICETAG + "/a[@data-id='50']")
    private WebElement addStickToCartLink;

    @FindBy(xpath = "//div[@class='quick_basket']" )
    private WebElement addedToCartLink;


    public CheeksPage(WebDriver driver) {
        super(driver);
    }

    public CheeksPage clickAddToCart() {
        click10(addStickToCartLink);
        return this;
    }

    public boolean isPriceTagChanged() {
        return isElementDisplayed(addedToCartLink);
    }
}
