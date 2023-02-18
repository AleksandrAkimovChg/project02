package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.apparel_and_accessories.TShirtsPage;

import java.util.List;

public abstract class ProductsPage<ProductsPageType> extends MainPage {

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    final static String SORT_BY = "//select[@id='sort']";
    final static String THUMBNAILS_GRID = "//div[@class='thumbnails grid row list-inline']";
    final static String THUMBNAILS_LIST = "//div[@class='thumbnails list row]";
    final static String FIXED_WRAPPER = "//div[@class='fixed_wrapper']";
    final static String PRDOCUTNAME = "//a[@class ='prdocutname']";
    final static String PRDOCUTNAME_PATH = MAIN_CONTAINER + FIXED_WRAPPER + PRDOCUTNAME;
    final static String THUMBNAIL = "//div[@class='thumbnail'][1]";
    final static String HREF_IMG_SCR = "/a[@href]/img[@src]";



    // sort
    @FindBy(xpath = SORT_BY)
    private WebElement sortBy;

    @FindBy(xpath = SORT_BY + "/option[2]")
    private WebElement sortByAZ;

    @FindBy(xpath = SORT_BY + "/option[3]")
    private WebElement sortByZA;

    @FindBy(xpath = SORT_BY + "/option[1]")
    private WebElement sortByDateOldNew;

    @FindBy(xpath = SORT_BY + "/option[8]")
    private WebElement sortByDateNewOldNew;

    @FindBy(xpath = SORT_BY + "/option[4]")
    private WebElement sortByPriceLowHigh;

    @FindBy(xpath = SORT_BY + "/option[5]")
    private WebElement sortByPriceHighLow;

    @FindBy(xpath = SORT_BY + "/option[7]")
    private WebElement sortByRatingHighest;

    @FindBy(xpath = SORT_BY + "/option[7]")
    private WebElement sortByRatingLowest;

    //
    @FindBy(xpath = "//button[@id='list']")
    private WebElement button_list;

    @FindBy(xpath = "//button[@id='grid']")
    private WebElement button_grid;

    // prdocutname
    @FindBy(xpath = PRDOCUTNAME_PATH)
    private List<WebElement> productTitle;

    @FindBy(xpath = "")
    private WebElement gridProductName1;

    @FindBy(xpath = "")
    private WebElement gridProductName2;

    @FindBy(xpath = "")
    private WebElement gridProductName3;

    @FindBy(xpath = "")
    private WebElement gridProductName4;

    @FindBy(xpath = "")
    private WebElement gridProductName5;

    @FindBy(xpath = "")
    private WebElement gridProductName6;

    @FindBy(xpath = "")
    private WebElement gridProductName7;

    @FindBy(xpath = "")
    private WebElement gridProductName8;



    // prdocutimage
    // MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[1]" + HREF_IMG_SCR
    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + THUMBNAIL + "[1]" + HREF_IMG_SCR)
    private WebElement gridProductImage1;

    @FindBy(xpath = "")
    private WebElement gridProductImage2;

    @FindBy(xpath = "")
    private WebElement gridProductImage3;

    @FindBy(xpath = "")
    private WebElement gridProductImage4;

    @FindBy(xpath = "")
    private WebElement gridProductImage5;

    @FindBy(xpath = "")
    private WebElement gridProductImage6;

    @FindBy(xpath = "")
    private WebElement gridProductImage7;

    @FindBy(xpath = "")
    private WebElement gridProductImage8;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    protected abstract ProductsPageType createProductsPage();

    public ProductsPageType clickMenu(int index, List<WebElement> menus) {
        menus.get(index).click();

        return createProductsPage();
    }

    public ProductsPageType clickSortBy(){
        click(sortBy);

        return createProductsPage();
    }

    public ProductsPageType clickSortByAZ(){
        click(sortByAZ);

        return createProductsPage();
    }

    public ProductsPageType clickSortByZA() {
        click(sortByZA);

        return createProductsPage();
    }

    public ProductsPageType clickButtonList() {
        click(button_list);

        return createProductsPage();
    }

    public ProductsPageType clickButtonGrid() {
        click(button_grid);

        return createProductsPage();
    }

    public void clickGridProduct_1() {
        click(gridProductImage1);
    }

    public void clickGridProduct_2() {
        click(gridProductImage2);
    }

    public void clickGridProduct_3() {
        click(gridProductImage3);
    }

    public void clickGridProduct_4() {
        click(gridProductImage5);
    }

    public void clickGridProduct_5() {
        click(gridProductImage5);
    }

    public void clickGridProduct_6() {
        click(gridProductImage6);
    }

    public void clickGridProduct_7() {
        click(gridProductImage7);
    }

    public void clickGridProduct_8() {
        click(gridProductImage8);
    }

    public List<String> getLinksText() {

        return getListText(productTitle);
    }
}
