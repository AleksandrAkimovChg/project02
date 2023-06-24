package pages.product_list;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.FormPage;

public abstract class ProductDescriptionPage<ProductDescriptionPageType> extends FormPage{

    /**
     * описана модель страницы -- локаторами.
     * каждый локатор надо проверять.
     */

    static final String MAIN_CONTAINER = "//div[@id='maincontainer']";
    static final String COLUMN_LEFT = "//div[@class='column_left col-md-3 col-xs-12']";
    static final String ROW_1 = "//li[1]";
    static final String ROW_2 = "//li[2]";
    static final String ROW_3 = "//li[3]";
    static final String ROW_4 = "//li[4]";
    static final String ONE_PRICE = "/div/span[@class='oneprice']";
    static final String PRICE_NEW = "/div/span[@class='pricenew']";
    static final String PRICE_OLD = "/div/span[@class='priceold']";

    static final String CONTINUE = "Continue";



    static final String PRODUCT_DESCRIPTION = "//div[@id='productdesc']//ul[@id='myTab']";
    static final String HREF_DESCRIPTION = "//a[@href='#description']";
    static final String HREF_REVIEW = "//a[@href='#review']";
    static final String HREF_TAGS = "//a[@href='#producttag']";
    static final String HREF_RELATED_PRODUCTS = "//a[@href='#relatedproducts']";

    // Review
    static final String TAB_PANEL_REVIEW = "//div[@id='review']";
    static final String RATING1 = "//div[@id='rating1']";
    static final String RATING2 = "//div[@id='rating2']";
    static final String RATING3 = "//div[@id='rating3']";
    static final String RATING4 = "//div[@id='rating4']";
    static final String RATING5 = "//div[@id='rating5']";
    static final String INPUT_NAME = "//input[@name='name' and @id='name']";
    static final String INPUT_REVIEW = "//textarea[@name='text' and @id='text']";
    static final String CAPTCHA = "//input[@name='captcha' and @id='captcha']";
    static final String SUBMIT_BUTTON = "//button[@id='review_submit']";

    // TAGS

    // COLUMN_LEFT

    public ProductDescriptionPage(WebDriver driver) {
        super(driver);
    }

    protected abstract ProductDescriptionPageType createProductDescriptionPage();
}
