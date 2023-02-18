package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class ProductsPage<ProductsPageType> extends MainPage {

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    final static String SORT_BY = "//select[@id='sort']";
    final static String THUMBNAILS_GRID = "//div[@class='thumbnails grid row list-inline']";
    final static String THUMBNAILS_LIST = "//div[@class='thumbnails list row]";
    final static String FIXED_WRAPPER = "//div[@class='fixed_wrapper']";
    final static String PRDOCUTNAME = "//a[@class ='prdocutname']";
    final static String PRDOCUTNAME_PATH = MAIN_CONTAINER + FIXED_WRAPPER + PRDOCUTNAME;
    final static String THUMBNAIL = "//div[@class='thumbnail']";
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

    // buttons
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
    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + "/div[1]" + THUMBNAIL + HREF_IMG_SCR)
    private WebElement gridProduct1Image;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + "/div[2]" + THUMBNAIL + HREF_IMG_SCR)
    private WebElement gridProduct2Image;

    @FindBy(xpath = "")
    private WebElement gridProduct3Image;

    @FindBy(xpath = "")
    private WebElement gridProduct4Image;

    @FindBy(xpath = "")
    private WebElement gridProduct5Image;

    @FindBy(xpath = "")
    private WebElement gridProduct6Image;

    @FindBy(xpath = "")
    private WebElement gridProduct7Image;

    @FindBy(xpath = "")
    private WebElement gridProduct8Image;

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

    public void clickGridProduct1() {
        click(gridProduct1Image);
    }

    public ProductsPageType clickGridRow1Product1() {
        click(gridProduct1Image);

        return createProductsPage();
    }

    public void clickGridProduct2() {
        click(gridProduct2Image);
    }

    public ProductsPageType clickGridRow1Product2() {
        click(gridProduct2Image);

        return createProductsPage();
    }

    public void clickGridProduct3() {
        click(gridProduct3Image);
    }

    public void clickGridProduct4() {
        click(gridProduct4Image);
    }

    public void clickGridProduct5() {
        click(gridProduct5Image);
    }

    public void clickGridRow2Product6() {
        click(gridProduct6Image);
    }

    public void clickGridProduct7() {
        click(gridProduct7Image);
    }

    public void clickGridProduct8() {
        click(gridProduct8Image);
    }

    public List<String> getLinksText() {

        return getListText(productTitle);
    }
}
