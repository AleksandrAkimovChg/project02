package pages.product_list;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.FormPage;

public abstract class ProductDescriptionPage<ProductDescriptionPageType> extends FormPage{

    /**
     * описана модель страницы -- локаторами.
     * каждый локатор надо проверять.
     */

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    final static String COLUMN_LEFT = "//div[@class='column_left col-md-3 col-xs-12']";
    final static String ROW_1 = "//li[1]";
    final static String ROW_2 = "//li[2]";
    final static String ROW_3 = "//li[3]";
    final static String ROW_4 = "//li[4]";
    final static String ONE_PRICE = "/div/span[@class='oneprice']";
    final static String PRICE_NEW = "/div/span[@class='pricenew']";
    final static String PRICE_OLD = "/div/span[@class='priceold']";

    final static String CONTINUE = "Continue";

    final static String PRODUCT_PRICE = "//div[@class='productfilneprice']";
    final static String PRODUCT_FORM = "//form[@id='product']";
    final static String RADIOBUTTON_1 = "//label[1]//input[@type='radio']";
    final static String RADIOBUTTON_2 = "//label[2]//input[@type='radio']";
    final static String RADIOBUTTON_3 = "//label[3]//input[@type='radio']";
    final static String RADIOBUTTON_4 = "//label[4]//input[@type='radio']";
    final static String RADIOBUTTON_5 = "//label[5]//input[@type='radio']";
    final static String SELECTOR = "//input[@id='product_quantity']";
    final static String PRODUCT_QUANTITY = "//input[@id='product_quantity']";
    final static String TOTAL_PRICE = "//span[@class='total-price']";
    final static String ADD_TO_CARD = "//ul[@class='productpagecart']";
    final static String PRINT = "//a[@class='productprint btn btn-large']";

    final static String PRODUCT_DESCRIPTION = "//div[@id='productdesc']//ul[@id='myTab']";
    final static String HREF_DESCRIPTION = "//a[@href='#description']";
    final static String HREF_REVIEW = "//a[@href='#review']";
    final static String HREF_TAGS = "//a[@href='#producttag']";
    final static String HREF_RELATED_PRODUCTS = "//a[@href='#relatedproducts']";

    // Review
    final static String TAB_PANEL_REVIEW = "//div[@id='review']";
    final static String RATING1 = "//div[@id='rating1']";
    final static String RATING2 = "//div[@id='rating2']";
    final static String RATING3 = "//div[@id='rating3']";
    final static String RATING4 = "//div[@id='rating4']";
    final static String RATING5 = "//div[@id='rating5']";
    final static String INPUT_NAME = "//input[@name='name' and @id='name']";
    final static String INPUT_REVIEW = "//textarea[@name='text' and @id='text']";
    final static String CAPTCHA = "//input[@name='captcha' and @id='captcha']";
    final static String SUBMIT_BUTTON = "//button[@id='review_submit']";

    // TAGS
    final static String TAB_PANEL_TAG = "//div[@id='producttag']";
    final static String BASE_URL = "https://automationteststore.com/index.php";
    final static String PRODUCT_SEARCH = "?rt=product/search";
    final static String TAG_FASHION = "&keyword=fashion";
    final static String TAG_SHOE = "&keyword=shoe";

    // COLUMN_LEFT
    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT)
    private WebElement column_left;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_1)
    private WebElement column_left_first_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_2)
    private WebElement column_left_second_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_3)
    private WebElement column_left_third_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_4)
    private WebElement column_left_fourth_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_1 + "/a[1][@href]")
    private WebElement column_left_row_1_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_2 + "/a[2][@href]")
    private WebElement column_left_row_2_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_3 + "/a[2][@href]")
    private WebElement column_left_row_3_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_4 + "/a[4][@href]")
    private WebElement column_left_row_4_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_1 + "/a[1][@href]")
    private WebElement column_left_row_1_link_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_2 + "/a[2][@href]")
    private WebElement column_left_row_2_link_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_3 + "/a[3][@href]")
    private WebElement column_left_row_3_link_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_4 + "/a[4][@href]")
    private WebElement column_left_row_4_link_href;


    // PRODUCT_DESCRIPTION
    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + "//li[1]")
    private WebElement product_description_1;

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + "//li[2]")
    private WebElement product_description_2;

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + "//li[3]")
    private WebElement product_description_3;

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + "//li[4]")
    private WebElement product_description_4;

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + HREF_DESCRIPTION)
    private WebElement href_description;

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + HREF_REVIEW)
    private WebElement href_review;

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + HREF_TAGS)
    private WebElement href_tags;

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + HREF_RELATED_PRODUCTS)
    private WebElement href_relatedproducts;

    // Review
    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + RATING1)
    private WebElement rating1;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + RATING2)
    private WebElement rating2;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + RATING3)
    private WebElement rating3;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + RATING4)
    private WebElement rating4;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + RATING5)
    private WebElement rating5;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + INPUT_NAME)
    private WebElement reviewInputName;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + INPUT_REVIEW)
    private WebElement reviewInputReview;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + CAPTCHA)
    private WebElement reviewCaptcha;

    @FindBy(xpath = PRODUCT_DESCRIPTION + TAB_PANEL_REVIEW + SUBMIT_BUTTON)
    private WebElement reviewSubmit;

    public ProductDescriptionPage(WebDriver driver) {
        super(driver);
    }

    protected abstract ProductDescriptionPageType createProductDescriptionPage();

    public ProductDescriptionPageType clickRow1() {
        click(column_left_row_1_link_href);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRow2() {
        click(column_left_row_2_link_href);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRow3() {
        click(column_left_row_3_link_href);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRow4() {
        click(column_left_row_4_link_href);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickDescription() {
        click(href_description);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickReviews() {
        click(href_review);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRating1() {
        click(rating1);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRating2() {
        click(rating2);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRating3() {
        click(rating3);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRating4() {
        click(rating4);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRating5() {
        click(rating5);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType inputName(String text) {
        click(reviewInputName);
        input(text, reviewInputName);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType inputReview(String text) {
        click(reviewInputReview);
        input(text, reviewInputReview);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType inputCaptcha(String text) {
        click(reviewCaptcha);
        input(text, reviewCaptcha);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType submit() {
        click(reviewSubmit);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickTags() {
        click(href_tags);

        return createProductDescriptionPage();
    }

    public ProductDescriptionPageType clickRelatedProducts() {
        click(href_relatedproducts);

        return createProductDescriptionPage();
    }
}
