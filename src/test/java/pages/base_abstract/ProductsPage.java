package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductsPage<CategoryPage> extends MainPage {

    static final String MAIN_CONTAINER = "//div[@id='maincontainer']";

    static final String TITLE_CATEGORY_PAGE = MAIN_CONTAINER + "//h1/span[@class='maintext']";
    static final String SORT_BY = "//select[@id='sort']";
    static final String THUMBNAILS_GRID = "//div[@class='thumbnails grid row list-inline']";
    static final String THUMBNAILS_LIST = "//div[@class='thumbnails list row]";
    static final String FIXED_WRAPPER = "//div[@class='fixed_wrapper']";
    static final String PRODUCT_NAME = "//a[@class='prdocutname']";
    static final String PRODUCT_NAME_PATH = MAIN_CONTAINER + FIXED_WRAPPER + PRODUCT_NAME;
    static final String THUMBNAIL = "//div[@class='thumbnail']";
    static final String HREF_IMG_SCR = "/a[@href]/img[@src]";
    static final String PRICE_CONTAINER = "//div[@class='pricetag jumbotron']";
    static final String PRICE = "//div[@class ='price']";
    static final String ONE_PRICE = "//div[@class ='oneprice']";
    static final String PRICE_NEW = "//div[@class ='pricenew']";
    static final String PRICE_OLD = "//div[@class ='priceold']";
    static final String PRODUCT_ONE_PRICE = MAIN_CONTAINER + PRICE_CONTAINER + ONE_PRICE;
    static final String PRODUCT_PRICE = MAIN_CONTAINER + PRICE_CONTAINER + "/div[@class='price']/div[1]";
    static final String OUT_OF_STOCK = "//span[@class='nostock']";

    /**
     * HOME Page Grid Elements
     */
    static final String FEATURED = "//div[@id='block_frame_featured_1769']";
    static final String LATEST_PRODUCTS = "//div[@id='block_frame_latest_1770']";
    static final String BESTSELLERS = "//div[@id='block_frame_bestsellers_1771']";
    static final String SPECIALS = "//div[@id='block_frame_special_1772']";

    static final String GRID_PRODUCT_1 = "//a[@data-id='50']";
    static final String GRID_PRODUCT_1_PRICETAG = "[contains(@href,'id=50')]";
    static final String GRID_PRODUCT_2 = "//a[@data-id='51']";
    static final String GRID_PRODUCT_2_PRICETAG = "[contains(@href,'id=51')]";
    static final String GRID_PRODUCT_3 = "//a[@data-id='52']";
    static final String GRID_PRODUCT_3_PRICETAG = "[contains(@href,'id=52')]";
    static final String GRID_PRODUCT_4 = "//a[@data-id='53']";
    static final String GRID_PRODUCT_4_PRICETAG = "[contains(@href,'id=53')]";
    static final String GRID_PRODUCT_5 = "//a[@data-id='68']";
    static final String GRID_PRODUCT_5_PRICETAG = "[contains(@href,'id=68')]";
    static final String GRID_PRODUCT_6 = "//a[@data-id='65']";
    static final String GRID_PRODUCT_6_PRICETAG = "[contains(@href,'id=65')]";
    static final String GRID_PRODUCT_7 = "//a[@data-id='66']";
    static final String GRID_PRODUCT_7_PRICETAG = "[contains(@href,'id=66')]";
    static final String GRID_PRODUCT_8 = "//a[@data-id='67']";
    static final String GRID_PRODUCT_8_PRICETAG = "[contains(@href,'id=67')]";
    static final String GRID_PRODUCT_9 = "//a[@data-id='50']";
    static final String GRID_PRODUCT_9_PRICETAG = "[contains(@href,'id=50')]";
    static final String GRID_PRODUCT_10 = "//a[@data-id='67']";
    static final String GRID_PRODUCT_10_PRICETAG = "[contains(@href,'id=67')]";
    static final String GRID_PRODUCT_11 = "//a[@data-id='88']";
    static final String GRID_PRODUCT_11_PRICETAG = "[contains(@href,'id=88')]";
    static final String GRID_PRODUCT_12 = "//a[@data-id='87']";
    static final String GRID_PRODUCT_12_PRICETAG = "[contains(@href,'id=87')]";
    static final String GRID_PRODUCT_13 = "//a[@data-id='65']";
    static final String GRID_PRODUCT_13_PRICETAG = "[contains(@href,'id=65')]";
    static final String GRID_PRODUCT_14 = "//a[@data-id='111']";
    static final String GRID_PRODUCT_14_PRICETAG = "[contains(@href,'id=111')]";
    static final String GRID_PRODUCT_15 = "//a[@data-id='88']";
    static final String GRID_PRODUCT_15_PRICETAG = "[contains(@href,'id=88')]";
    static final String GRID_PRODUCT_16 = "//a[@data-id='87']";
    static final String GRID_PRODUCT_16_PRICETAG = "[contains(@href,'id=87')]";

    /**
     * title
     */

    @FindBy(xpath = TITLE_CATEGORY_PAGE)
    private WebElement title;

    /**
     * sort
     */

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

    /**
     * buttons
     */
    @FindBy(xpath = "//button[@id='list']")
    private WebElement button_list;

    @FindBy(xpath = "//button[@id='grid']")
    private WebElement button_grid;

    @FindBy(xpath = FEATURED + GRID_PRODUCT_1)
    private WebElement addProductToCartButton_1;

    @FindBy(xpath = FEATURED + GRID_PRODUCT_2)
    private WebElement outOfStokeTag_2;
    @FindBy(xpath = LATEST_PRODUCTS + GRID_PRODUCT_8)
    private WebElement outOfStokeTag_8;
    @FindBy(xpath = BESTSELLERS + GRID_PRODUCT_10)
    private WebElement outOfStokeTag_10;
    @FindBy(xpath = BESTSELLERS + GRID_PRODUCT_12)
    private WebElement outOfStokeTag_12;
    @FindBy(xpath = SPECIALS + GRID_PRODUCT_15)
    private WebElement outOfStokeTag_15;

    /**
     * product name
     */
    @FindBy(xpath = PRODUCT_NAME_PATH)
    private List<WebElement> productTitle;

    /* Grid products elements on home page */
    @FindBy(xpath = FEATURED + PRODUCT_NAME + GRID_PRODUCT_1_PRICETAG)
    private WebElement gridProduct1_Name;
    @FindBy(xpath = FEATURED + PRODUCT_NAME + GRID_PRODUCT_2_PRICETAG)
    private WebElement gridProduct2_Name;
    @FindBy(xpath = FEATURED + PRODUCT_NAME + GRID_PRODUCT_3_PRICETAG)
    private WebElement gridProduct3_Name;
    @FindBy(xpath = FEATURED + PRODUCT_NAME + GRID_PRODUCT_4_PRICETAG)
    private WebElement gridProduct4_Name;
    @FindBy(xpath = LATEST_PRODUCTS + PRODUCT_NAME + GRID_PRODUCT_5_PRICETAG)
    private WebElement gridProduct5_Name;
    @FindBy(xpath = LATEST_PRODUCTS + PRODUCT_NAME + GRID_PRODUCT_6_PRICETAG)
    private WebElement gridProduct6_Name;
    @FindBy(xpath = LATEST_PRODUCTS + PRODUCT_NAME + GRID_PRODUCT_7_PRICETAG)
    private WebElement gridProduct7_Name;
    @FindBy(xpath = LATEST_PRODUCTS + PRODUCT_NAME + GRID_PRODUCT_8_PRICETAG)
    private WebElement gridProduct8_Name;
    @FindBy(xpath = BESTSELLERS  + PRODUCT_NAME + GRID_PRODUCT_9_PRICETAG)
    private WebElement gridProduct9_Name;
    @FindBy(xpath = BESTSELLERS  + PRODUCT_NAME + GRID_PRODUCT_10_PRICETAG)
    private WebElement gridProduct10_Name;
    @FindBy(xpath = BESTSELLERS  + PRODUCT_NAME + GRID_PRODUCT_11_PRICETAG)
    private WebElement gridProduct11_Name;
    @FindBy(xpath = BESTSELLERS  + PRODUCT_NAME + GRID_PRODUCT_12_PRICETAG)
    private WebElement gridProduct12_Name;
    @FindBy(xpath = SPECIALS  + PRODUCT_NAME + GRID_PRODUCT_13_PRICETAG)
    private WebElement gridProduct13_Name;
    @FindBy(xpath = SPECIALS  + PRODUCT_NAME + GRID_PRODUCT_14_PRICETAG)
    private WebElement gridProduct14_Name;
    @FindBy(xpath = SPECIALS  + PRODUCT_NAME + GRID_PRODUCT_15_PRICETAG)
    private WebElement gridProduct15_Name;
    @FindBy(xpath = SPECIALS  + PRODUCT_NAME + GRID_PRODUCT_16_PRICETAG)
    private WebElement gridProduct16_Name;

    @FindBy(xpath = FEATURED +  "/div[1]" + THUMBNAIL + HREF_IMG_SCR)
    private WebElement gridProductHome1_Image;

    /* Grid products elements on other than home page */
    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + "/div[1]" + THUMBNAIL + HREF_IMG_SCR)
    private WebElement gridProduct1Image;

    @FindBy(xpath = MAIN_CONTAINER + THUMBNAILS_GRID + "/div[2]" + THUMBNAIL + HREF_IMG_SCR)
    private WebElement gridProduct2Image;



    /**
     * Product prices
     */
    @FindBy(xpath = PRODUCT_PRICE)
    private List<WebElement> productPrice;

    @FindBy(xpath = FEATURED + GRID_PRODUCT_1 + "//.." + ONE_PRICE)
    private WebElement gridProduct1_Price;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_2 + "//.." + PRICE_NEW)
    private WebElement gridProduct2_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_2 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct2_PriceOld;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_3 + "//.." + ONE_PRICE)
    private List<WebElement> gridProduct3_Price;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_4 + "//.." + ONE_PRICE)
    private List<WebElement> gridProduct4_Price;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_5 + "//.." + ONE_PRICE)
    private List<WebElement> gridProduct5_Price;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_6 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct6_Price;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_6 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct6_PriceOld;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_7 + "//.." + ONE_PRICE)
    private List<WebElement> gridProduct7_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_8 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct8_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_7 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct7_PriceOld;
    @FindBy(xpath = SPECIALS + GRID_PRODUCT_9 + "//.." + ONE_PRICE)
    private List<WebElement> gridProduct9_Price;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_10 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct10_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_10 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct10_PriceOld;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_11 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct11_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_11 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct11_PriceOld;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_12 + "//.." + ONE_PRICE)
    private List<WebElement> gridProduct12_Price;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_13 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct13_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_13 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct13_PriceOld;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_14 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct14_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_14 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct14_PriceOld;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_15 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct15_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_15 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct15_PriceOld;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_16 + "//.." + PRICE_NEW)
    private List<WebElement> gridProduct16_PriceNew;
    @FindBy(xpath = FEATURED + GRID_PRODUCT_16 + "//.." + PRICE_OLD)
    private List<WebElement> gridProduct16_PriceOld;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    protected abstract CategoryPage createProductsPage();

    /**
     * click
     */
    public CategoryPage clickMenu(int index, List<WebElement> menus) {
        menus.get(index).click();

        return createProductsPage();
    }

    public CategoryPage clickSortBy(){
        click(sortBy);

        return createProductsPage();
    }

    public CategoryPage clickSortByAZ(){
        click(sortByAZ);

        return createProductsPage();
    }

    public CategoryPage clickSortByZA() {
        click(sortByZA);

        return createProductsPage();
    }

    public CategoryPage clickButtonList() {
        click(button_list);

        return createProductsPage();
    }

    public CategoryPage clickButtonGrid() {
        click(button_grid);

        return createProductsPage();
    }

    public void clickGridProduct1() {
        click(gridProduct1Image);
    }

    public CategoryPage clickGridRow1Product1() {
        click(gridProduct1Image);

        return createProductsPage();
    }

    public void clickGridProduct2() {
        click(gridProduct2Image);
    }

    public CategoryPage clickGridRow1Product2() {
        click(gridProduct2Image);

        return createProductsPage();
    }

    public CategoryPage clickAddToCart_GridProduct1() {
        click10(addProductToCartButton_1);
        return createProductsPage();
    }

    /**
     * List
     */
    public List<String> getLinksText() {

        return getListText(productTitle);
    }

    public List<Double> getLinksPrices() {
        List<String> str = getListText(productPrice);
        List<Double> prices = new ArrayList<Double>();
        
        for (int i = 0; i < str.size(); i++) {
            prices.add(Double.valueOf(str.get(i).replaceAll("[$,]", "")));
        }

        return prices;
    }

    public CategoryPage clickSortByPriceLowHigh() {
        click(sortByPriceLowHigh);

        return createProductsPage();
    }

    public CategoryPage clickSortByPriceHighLow() {
        click(sortByPriceHighLow);

        return createProductsPage();
    }

    public Double[] bubbleSortDoubleArray(Double[] array) {
        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 1; i < array.length; i ++)  {
                if (array[i - 1] > array[i]) {
                    Double temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    isSorted = false;
                }
            }
        }

        return array;
    }

    public Double[] reverseDoubleArray(Double[] array) {
        if (array.length == 0) {

            return new Double[]{};
        }

        Double[] result = new Double[array.length];
        int count = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            result[count] = array[i];
            count--;
        }

        return result;
    }

    /**
     * Get Name of Products
     */

    public String getGridProduct1_Name() {  //clickAddToCart_GridProduct1
        return getText(gridProduct1_Name);
    }

    public String getGridProduct2_Name() {
        return getText(gridProduct2_Name);
    }

    public String getGridProduct3_Name() {
        return getText(gridProduct3_Name);
    }
    public String getGridProduct4_Name() {
        return getText(gridProduct4_Name);
    }
    public String getGridProduct5_Name() {
        return getText(gridProduct5_Name);
    }
    public String getGridProduct6_Name() {
        return getText(gridProduct6_Name);
    }
    public String getGridProduct7_Name() {
        return getText(gridProduct7_Name);
    }
    public String getGridProduct8_Name() {
        return getText(gridProduct8_Name);
    }
    public String getGridProduct9_Name() {
        return getText(gridProduct9_Name);
    }
    public String getGridProduct10_Name() {
        return getText(gridProduct10_Name);
    }
    public String getGridProduct11_Name() {
        return getText(gridProduct11_Name);
    }
    public String getGridProduct12_Name() {
        return getText(gridProduct12_Name);
    }
    public String getGridProduct13_Name() {
        return getText(gridProduct13_Name);
    }
    public String getGridProduct14_Name() {
        return getText(gridProduct14_Name);
    }
    public String getGridProduct15_Name() {
        return getText(gridProduct15_Name);
    }
    public String getGridProduct16_Name() {
        return getText(gridProduct16_Name);
    }

    /**
     * Get price as text
     */
    public String getGridProduct1_Price() {
        return getText(gridProduct1_Price);
    }
}
