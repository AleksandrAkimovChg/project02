package pages.hair_care;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.home.cart.CartPage;
import pages.product_list.DescriptionPage;


public class SeaweedConditionerProductPage extends DescriptionPage<SeaweedConditionerProductPage> {

    @FindBy(xpath = "//h1")
    private WebElement productTitle;

    @FindBy(xpath = "//ul[@class='productpagecart']//a")
    private WebElement addToCardBtn;

    public SeaweedConditionerProductPage(WebDriver driver) {
            super(driver);
    }

    protected SeaweedConditionerProductPage createProductDescriptionPage() {
        return this;
    }

    public String getProductTitle() {
        return productTitle.getText();
    }

    public CartPage clickAddToCardBtn() {
        addToCardBtn.click();
        return new CartPage(getDriver());
    }
}




