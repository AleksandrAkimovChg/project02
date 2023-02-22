package testData;

import jdk.jfr.Description;

public class ProjectConstants {

    /**
     * Test login \ password
     */
    public static final String LOGIN_NAME = "testtestoff940";
    public static final String PASSWORD = "Testoff29012003";
    public static final String WRONG_LOGIN_NAME = "testestoff940";
    public static final String WRONG_PASSWORD = "Testof29O12003";

    /**
     * Test URL
     */
    static final String BASE_URL = "https://automationteststore.com/index.php";
    static final String PRODUCT_SEARCH = "?rt=product/search";
    static final String PRODUCT_QUERY_PARAMS = "?rt=product/product&path=";
    static final String URL_PRODUCT_ID = BASE_URL + PRODUCT_QUERY_PARAMS;
    static final String CATEGORY_SHOES = "68&product_id=";
    static final String CATEGORY_PAPERBACK = "65&product_id=";
    static final String TAG_FASHION = "&keyword=fashion";
    static final String TAG_SHOE = "&keyword=shoe";

    public final static String MEN_PAGE_URL = BASE_URL + "?rt=product/category&path=58";
    public final static String MEN_PAGE_TITLE = "Men";
    public final static String SKINCARE_PAGE_URL = BASE_URL + "?rt=product/category&path=43";
    public final static String SKINCARE_PAGE_TITLE = "Skincare";

    public final static String SEARCH_CRITERIA = "MEN";
    public final static String SEARCH_PAGE_URL = BASE_URL + "?rt=product/search&limit=&keyword=" + SEARCH_CRITERIA
            + "&category_id=0";

    /**
     * List of products
     */
    public final static String ID_112 = "The Miracle Morning: The Not-So-Obvious Secret Guaranteed to Transform Your Life";
    public final static String ID_113 = "Paper Towns by John Green";
    public final static String ID_114 = "Allegiant by Veronica Roth";
    public final static String ID_115 = "Fiorella Purple Peep Toes";
    public final static String ID_116 = "New Ladies High Wedge Heel Toe Thong Diamante Flip Flop Sandals";
    public final static String ID_117 = "Ruby Shoo Womens Jada T-Bar";
    public final static String ID_118 = "Womens high heel point toe stiletto sandals ankle strap court shoes";

    /**
     * List of products URL
     */

    /**
     * Shoes
     */
    @Description(ID_116)
    public static final String EXPECTED_URL_PRODUCT_ID_116 = URL_PRODUCT_ID + CATEGORY_SHOES + "116";

    @Description(ID_118)
    public static final String EXPECTED_URL_PRODUCT_ID_118 = URL_PRODUCT_ID + CATEGORY_SHOES + "118";

    /**
     * Paperback
     */
    @Description(ID_112)
    public static final String EXPECTED_URL_PRODUCT_ID_112 = URL_PRODUCT_ID + CATEGORY_PAPERBACK + "112";

    @Description(ID_113)
    public static final String EXPECTED_URL_PRODUCT_ID_113 = URL_PRODUCT_ID + CATEGORY_PAPERBACK + "113";

    @Description(ID_114)
    public static final String EXPECTED_URL_PRODUCT_ID_114 = URL_PRODUCT_ID + CATEGORY_PAPERBACK + "114";
}

