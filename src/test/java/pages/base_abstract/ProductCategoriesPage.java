package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public abstract class ProductCategoriesPage extends MainPage {

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    final static String THUMBNAILS_GRID = MAIN_CONTAINER + "//div[@class='thumbnails grid row list-inline']";
    final static String FIXED_WRAPPER = MAIN_CONTAINER + "//div[@class='fixed_wrapper']";
    final static String THUMBNAIL_1 = "//div[@class='thumbnail'][1]";
    final static String THUMBNAIL_2 = "//div[@class='thumbnail'][2]";
    final static String THUMBNAIL_3 = "//div[@class='thumbnail'][3]";
    final static String THUMBNAIL_4 = "//div[@class='thumbnail'][4]";
    final static String THUMBNAIL_5 = "//div[@class='thumbnail'][5]";
    final static String THUMBNAIL_6 = "//div[@class='thumbnail'][6]";
    final static String THUMBNAIL_7 = "//div[@class='thumbnail'][7]";
    final static String THUMBNAIL_8 = "//div[@class='thumbnail'][8]";
    final static String HREF_IMG_SCR = "/a[@href]/img[@src]";

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_1 + HREF_IMG_SCR)
    private WebElement grid_product_1;

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_2 + HREF_IMG_SCR)
    private WebElement grid_product_2;

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_3 + HREF_IMG_SCR)
    private WebElement grid_product_3;

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_4 + HREF_IMG_SCR)
    private WebElement grid_product_4;

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_5 + HREF_IMG_SCR)
    private WebElement grid_product_5;

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_6 + HREF_IMG_SCR)
    private WebElement grid_product_6;

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_7 + HREF_IMG_SCR)
    private WebElement grid_product_7;

    @FindBy(xpath = THUMBNAILS_GRID + THUMBNAIL_8 + HREF_IMG_SCR)
    private WebElement grid_product_8;

    @FindBy(id = "//select[@id='sort']")
    private WebElement sortBy;

    @FindBy(id = "//select[@id='sort']/option[2]")
    private WebElement sortByAZ;
    public ProductCategoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickGridProduct_1() {
        click(grid_product_1);
    }

    public void clickGridProduct_2() {
        click(grid_product_2);
    }

    public void clickGridProduct_3() {
        click(grid_product_3);
    }

    public void clickGridProduct_4() {
        click(grid_product_5);
    }

    public void clickGridProduct_5() {
        click(grid_product_5);
    }

    public void clickGridProduct_6() {
        click(grid_product_6);
    }

    public void clickGridProduct_7() {
        click(grid_product_7);
    }

    public void clickGridProduct_8() {
        click(grid_product_8);
    }
}
