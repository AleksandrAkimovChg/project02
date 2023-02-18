package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class ProductsPage<ProductsPageType> extends MainPage {

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    final static String THUMBNAILS_GRID = "//div[@class='thumbnails grid row list-inline']";
    final static String THUMBNAILS_LIST = "//div[@class='thumbnails list row]";
    final static String FIXED_WRAPPER = "//div[@class='fixed_wrapper']";
    final static String THUMBNAIL = "//div[@class='thumbnail']";
    final static String HREF_IMG_SCR = "/a[@href]/img[@src]";

    @FindBy(xpath = "//select[@name='sort' or id='sort']")
    private WebElement sort_by;

    @FindBy(xpath = "//button[@id='list']")
    private WebElement button_list;

    @FindBy(xpath = "//button[@id='grid']")
    private WebElement button_grid;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[1]" + HREF_IMG_SCR)
    private WebElement grid_product_1;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[2]" + HREF_IMG_SCR)
    private WebElement grid_product_2;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[3]" +  HREF_IMG_SCR)
    private WebElement grid_product_3;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[4]" + HREF_IMG_SCR)
    private WebElement grid_product_4;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[5]" + HREF_IMG_SCR)
    private WebElement grid_product_5;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[6]" + HREF_IMG_SCR)
    private WebElement grid_product_6;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[7]" + HREF_IMG_SCR)
    private WebElement grid_product_7;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[8]" + HREF_IMG_SCR)
    private WebElement grid_product_8;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    protected abstract ProductsPageType createProductsPage();

    public ProductsPageType clickMenu(int index, List<WebElement> menus) {
        menus.get(index).click();

        return createProductsPage();
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

    public ProductsPageType clickButtonList() {
        click(button_list);

        return createProductsPage();
    }

    public ProductsPageType clickButtonGrid() {
        click(button_grid);

        return createProductsPage();
    }
}
