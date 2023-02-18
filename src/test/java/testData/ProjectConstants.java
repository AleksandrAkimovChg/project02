package testData;

import jdk.jfr.Description;

public class ProjectConstants {

    //    Test login \ password
    public static final String LOGIN_NAME = "testtestoff940";
    public static final String PASSWORD = "Testoff29012003";
    public static final String WRONG_LOGIN_NAME = "testestoff940";
    public static final String WRONG_PASSWORD = "Testof29O12003";

    //    Test URL
    static final String BASE_URL = "https://automationteststore.com/index.php";
    static final String PRODUCT_SEARCH = "?rt=product/search";
    static final String PRODUCT_QUERY_PARAMS = "?rt=product/product&path=68&product_id=";
    static final String URL_PRODUCT_ID = BASE_URL + PRODUCT_QUERY_PARAMS;
    static final String TAG_FASHION = "&keyword=fashion";
    static final String TAG_SHOE = "&keyword=shoe";

    public final static String MEN_PAGE_URL = BASE_URL + "?rt=product/category&path=58";
    public final static String MEN_PAGE_TITLE = "Men";
    public final static String SKINCARE_PAGE_URL = BASE_URL + "?rt=product/category&path=43";
    public final static String SKINCARE_PAGE_TITLE = "Skincare";

    @Description("New Ladies High Wedge Heel Toe Thong Diamante Flip Flop Sandals")
    public static final String EXPECTED_URL_PRODUCT_ID_116 = URL_PRODUCT_ID + "116";

    @Description("Womens high heel point toe stiletto sandals ankle strap court shoes")
    public static final String EXPECTED_URL_PRODUCT_ID_118 = URL_PRODUCT_ID + "118";
}

