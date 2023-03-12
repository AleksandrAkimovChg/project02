package pages.home.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.MainPage;

public class SuccessPage extends MainPage {

    @FindBy(xpath = "//div[@id='maincontainer']//h1/span[1]")
    private WebElement confirmOrderH1Header;
    @FindBy(xpath = "//div[@id='payment']/div/i")
    private WebElement confirmOrderBlueButton;

    public SuccessPage(WebDriver driver) {
        super(driver);
    }

    public SuccessPage waitForBlueContainerDisappeared() {
        waitForBlueContainerDisappeared(confirmOrderBlueButton);

        return this;
    }
    public String getConfirmOrderH1HeaderText() {

        return getText(confirmOrderH1Header);
    }


}
