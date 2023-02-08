package pages.product_list;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.FormPage;

public abstract class ProductDescriptionPage<DescriptionPageType> extends FormPage {

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    final static String COLUMN_LEFT = "//div[@class='column_left col-md-3 col-xs-12']";
    final static String ROW_1 = "//li[1]";
    final static String ROW_2 = "//li[2]";
    final static String ROW_3 = "//li[3]";
    final static String FOURTH_ROW = "//li[4]";
    final static String ONE_PRICE = "/div/span[@class='oneprice']";
    final static String PRICE_NEW = "/div/span[@class='pricenew']";
    final static String PRICE_OLD = "/div/span[@class='priceold']";

    final static String PRODUCT_PRICE = "//div[@class='productfilneprice']";
    final static String PRODUCT_FORM = "//form[@id='product']";
    final static String RADIOBUTTON_1 = "//label[1]//input[@type='radio']";
    final static String RADIOBUTTON_2 = "//label[2]//input[@type='radio']";
    final static String RADIOBUTTON_3 = "//label[3]//input[@type='radio']";
    final static String RADIOBUTTON_4 = "//label[4]//input[@type='radio']";
    final static String SELECTOR = "//input[@id='product_quantity']";
    final static String PRODUCT_QUANTITY = "//input[@id='product_quantity']";
    final static String TOTAL_PRICE = "//span[@class='total-price']";
    final static String ADD_TO_CARD = "//ul[@class='productpagecart']";
    final static String PRINT = "//a[@class='productprint btn btn-large']";

    final static String PRODUCT_DESCRIPTION = "//div[@id='productdesc']//ul[@id='myTab']";
    final static String HREF_DESCRIPTION = "//a[@href='#description']";
    final static String HREF_REVIEW = "//a[@href='#review']";
    final static String HREF_TAGS = "//a[@href='#producttag']";
    final static String HREF_RELATEDPRODUCTS = "//a[@href='#relatedproducts']";

    // TAGS



    // Review

    final static String INPUT_NAME = "//input[@name='name' or @id='name']";
    final static String INPUT_REVIEW = "//textarea[@name='text' or @id='text']";
    final static String CAPTCHA = "//input[@name='captcha' or @id='captcha']";
    final static String SUBMIT_BUTTON = "//button[@id='review_submit']";

    //


    // COLUMN_LEFT
    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT)
    private WebElement column_left;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_1)
    private WebElement column_left_first_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_2)
    private WebElement column_left_second_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_3)
    private WebElement column_left_third_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + FOURTH_ROW)
    private WebElement column_left_fourth_row;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_1 + "/a[1][@href]")
    private WebElement column_left_first_row_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_2 + "/a[2][@href]")
    private WebElement column_left_second_row_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_3 + "/a[2][@href]")
    private WebElement column_left_third_row_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + FOURTH_ROW + "/a[4][@href]")
    private WebElement column_left_fourth_row_img_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_1 + "/a[1][@href]")
    private WebElement column_left_first_row_link_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_2 + "/a[2][@href]")
    private WebElement column_left_second_row_link_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + ROW_3 + "/a[3][@href]")
    private WebElement column_left_third_row_link_href;

    @FindBy(xpath = MAIN_CONTAINER + COLUMN_LEFT + FOURTH_ROW + "/a[4][@href]")
    private WebElement column_left_fourth_row_link_href;


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

    @FindBy(xpath = MAIN_CONTAINER + PRODUCT_DESCRIPTION + HREF_RELATEDPRODUCTS)
    private WebElement href_relatedproducts;

    public ProductDescriptionPage(WebDriver driver) {
        super(driver);
    }

    protected abstract DescriptionPageType createDescriptionPage();

    public DescriptionPageType clickDescription() {
        click(href_description);

        return createDescriptionPage();
    }

    public DescriptionPageType clickReviews() {
        click(href_review);

        return createDescriptionPage();
    }

    public DescriptionPageType clickTags() {
        click(href_tags);

        return createDescriptionPage();
    }

    public DescriptionPageType clickRelatedProducts() {
        click(href_relatedproducts);

        return createDescriptionPage();
    }
}
