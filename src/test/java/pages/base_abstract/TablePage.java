package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class TablePage extends FormPage {

    @FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr/th")
    private List<WebElement> tableHeaders;

    private static final String PRODUCT_1_IN_CART_IMAGE_URL = "//table/tbody/tr[2]/td[1]/a";
    private static final String PRODUCT_2_IN_CART_IMAGE_URL = "//table/tbody/tr[3]/td[1]/a";
    private static final String PRODUCT_IN_CART_IMAGE = "/img";
    private static final String PRODUCT_1_IN_CART_IMAGE = PRODUCT_1_IN_CART_IMAGE_URL + PRODUCT_IN_CART_IMAGE;
    private static final String PRODUCT_1_IN_CART_NAME = "//table/tbody/tr[2]/td[2]/a"; // first product with any ID
    private static final String PRODUCT_2_IN_CART_NAME = "//table/tbody/tr[3]/td[2]/a"; // second product with any ID
    private static final String PRODUCT_ID = "[contains(@href,'id=')]";  // any ID to add to xpath for verifying url
    private static final String PRODUCT_1_IN_CART_PRICE = "//table/tbody/tr[2]/td[4]";
    private static final String PRODUCT_2_IN_CART_PRICE = "//table/tbody/tr[3]/td[4]";

    @FindBy(xpath = PRODUCT_1_IN_CART_NAME)
    private WebElement Product_1_inCartName;
    @FindBy(xpath = PRODUCT_1_IN_CART_PRICE)
    private WebElement Product_1_inCartPrice;

    public TablePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getTableHeaders() {

        return getListText(tableHeaders);
    }

    /**
     * methods for Products in Cart
     */
    public String getGridProduct1_inCartName() {
        return getText(Product_1_inCartName);
    }

    public String getGridProduct1_inCartPrice() {
        return getText(Product_1_inCartPrice);
    }

}
