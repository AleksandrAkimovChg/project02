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

    @Description("New Ladies High Wedge Heel Toe Thong Diamante Flip Flop Sandals")
    public static final String URL_PRODUCT_ID_116 = URL_PRODUCT_ID + "116";
}