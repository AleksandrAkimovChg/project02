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
    static final String CATEGORY_CHEEKS = "40&product_id=";

    public final static String LOGIN_PAGE_URL = BASE_URL + "?rt=account/login";
    public final static String CART_PAGE_URL = BASE_URL + "?rt=checkout/cart";
    public final static String CHECKOUT_PAGE_URL = BASE_URL + "?rt=checkout/confirm";
    public final static String SUCCSESS_PAGE_URL = BASE_URL + "?rt=checkout/success";
    public final static String MY_ACCOUNT_PAGE_URL = BASE_URL + "?rt=account/account";
    public final static String LOGUNT_PAGE_URL = BASE_URL + "?rt=account/logout";
    public final static String EYES_SKINCARE_PAGE_URL = BASE_URL + "?rt=product/category&path=43_47";
    public final static String EYES_SKINCARE_PAGE_TITLE = "Eyes";
    public final static String FACE_SKINCARE_PAGE_URL = BASE_URL + "?rt=product/category&path=43_46";
    public final static String FACE_SKINCARE_PAGE_TITLE = "Face";
    public final static String MEN_PAGE_URL = BASE_URL + "?rt=product/category&path=58";
    public final static String MEN_PAGE_TITLE = "Men";
    public final static String SKINCARE_PAGE_URL = BASE_URL + "?rt=product/category&path=43";
    public final static String SKINCARE_PAGE_TITLE = "Skincare";

    public final static String SEARCH_CRITERIA = " MEN ";
    public final static String SEARCH_PAGE_URL = BASE_URL + "?rt=product/search&limit=&keyword=%20MEN%20&category_id=0";

    /**
     * List of products
     */

    public final static String ID_50 = "Skinsheen Bronzer Stick";
    public final static String ID_51 = "BeneFit Girl Meets Pearl";
    public final static String ID_52 = "Benefit Bella Bamba";
    public final static String ID_53 = "Tropiques Minerale Loose Bronzer";
    public final static String ID_54 = "L'EXTRÊME Instant Extensions Lengthening Mascara";
    public final static String ID_55 = "LE ROUGE ABSOLU Reshaping & Replenishing LipColour SPF 15";
    public final static String ID_56 = "Waterproof Protective Undereye Concealer";
    public final static String ID_57 = "Delicate Oil-Free Powder Blush";
    public final static String ID_58 = "Product with stock locations";
    public final static String ID_59 = "Viva Glam Lipstick";
    public final static String ID_64 = "Beauty Eau de Parfum";
    public final static String ID_65 = "Absolue Eye Precious Cells";
    public final static String ID_69 = "Seaweed Conditioner";
    public final static String ID_71 = "Pantene Pro-V Conditioner, Classic Care";
    public final static String ID_72 = "Brunette expressions Conditioner";
    public final static String ID_73 = "Highlighting Expressions";
    public final static String ID_75 = "Dove Men +Care Body Wash";
    public final static String ID_77 = "Men+Care Active Clean Shower Tool";
    public final static String ID_79 = "ck One Gift Set";
    public final static String ID_84 = "Armani Code Pour Femme";
    public final static String ID_85 = "Forbidden euphoria Eau de Parfum Spray";
    public final static String ID_88 = "ck one Summer 3.4 oz";
    public final static String ID_89 = "Secret Obsession Perfume";
    public final static String ID_90 = "Obsession Night Perfume";
    public final static String ID_96 = "Eye master";
    public final static String ID_97 = "Eye Rejuvenating Serum";
    public final static String ID_101 = "Pro-V Color Hair Solutions Color Preserve Shine Conditioner";
    public final static String ID_102 = "Gucci Guilty";
    public final static String ID_104 = "Calvin Klein Obsession For Women EDP Spray";
    public final static String ID_105 = "Bvlgari Aqua";
    public final static String ID_106 = "Omnia Eau de Toilette 65ml";
    public final static String ID_107 = "Lancome Slimissime 360 Slimming Activating Concentrate Unisex Treatment";
    public final static String ID_108 = "Lancome Hypnose Doll Lashes Mascara 4-Piece Gift Set";
    public final static String ID_110 = "Flora By Gucci Eau Fraiche";
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
    @Description("SHOES page")
    public static final String EXPECTED_URL_SHOES_PAGE = BASE_URL + "?rt=product/category&path=68_69";

    @Description("SHOES page title")
    public static final String EXPECTED_TITLE_SHOES_PAGE = "SHOES";

    /**
     * T-shirts
     */
    @Description("TSHIRTS page")
    public static final String EXPECTED_URL_TSHIRTS_PAGE = BASE_URL + "?rt=product/category&path=68_70";

    @Description("TSHIRTS page title")
    public static final String EXPECTED_TITLE_TSHIRTS_PAGE = "T-SHIRTS";

    @Description(ID_116)
    public static final String EXPECTED_URL_PRODUCT_ID_116 = URL_PRODUCT_ID + CATEGORY_SHOES + "116";

    @Description(ID_118)
    public static final String EXPECTED_URL_PRODUCT_ID_118 = URL_PRODUCT_ID + CATEGORY_SHOES + "118";

    /**
     * Face
     */
    @Description("FACE_MAKEUP page")
    public static final String EXPECTED_URL_FACE_MAKEUP_PAGE = BASE_URL + "?rt=product/category&path=36_38";

    @Description("FACE_MAKEUP page title")
    public static final String EXPECTED_TITLE_FACE_MAKEUP_PAGE = "FACE";

    /**
     * Men
     */
    @Description("BODY & SHOWER page")
    public static final String EXPECTED_URL_BODY_AND_SHOWER_PAGE = BASE_URL + "?rt=product/category&path=58_63";

    @Description("BODY & SHOWER page title")
    public static final String EXPECTED_TITLE_BODY_AND_SHOWER_PAGE = "BODY & SHOWER";

    @Description("FRAGRANCE SETS page")
    public static final String EXPECTED_URL_FRAGRANCE_SETS_PAGE = BASE_URL + "?rt=product/category&path=58_59";

    @Description("FRAGRANCE SETS page title")
    public static final String EXPECTED_TITLE_FRAGRANCE_SETS_PAGE = "FRAGRANCE SETS";

    @Description("PRE-SHAVE & SHAVING page")
    public static final String EXPECTED_URL_PRESHAVE_AND_SHAVING_PAGE = BASE_URL + "?rt=product/category&path=58_61";

    @Description("PRE-SHAVE & SHAVING page title")
    public static final String EXPECTED_TITLE_PRESHAVE_AND_SHAVING_PAGE = "PRE-SHAVE & SHAVING";

    @Description("SKINCARE page")
    public static final String EXPECTED_URL_SKINCARE_PAGE = BASE_URL + "?rt=product/category&path=58_60";

    @Description("SKINCARE page title")
    public static final String EXPECTED_TITLE_SKINCARE_PAGE = "SKINCARE";

    /**
     * Paperback
     */
    @Description(ID_112)
    public static final String EXPECTED_URL_PRODUCT_ID_112 = URL_PRODUCT_ID + CATEGORY_PAPERBACK + "112";

    @Description(ID_113)
    public static final String EXPECTED_URL_PRODUCT_ID_113 = URL_PRODUCT_ID + CATEGORY_PAPERBACK + "113";

    @Description(ID_114)
    public static final String EXPECTED_URL_PRODUCT_ID_114 = URL_PRODUCT_ID + CATEGORY_PAPERBACK + "114";

    /**
     * Makeup/Cheeks
     */
    @Description(ID_50)
    public static final String EXPECTED_URL_PRODUCT_ID_50 = URL_PRODUCT_ID + CATEGORY_CHEEKS + "50";

    @Description(ID_53)
    public static final String EXPECTED_URL_PRODUCT_ID_53 = URL_PRODUCT_ID + CATEGORY_CHEEKS + "53";

    @Description(ID_51)
    public static final String EXPECTED_URL_PRODUCT_ID_51 = URL_PRODUCT_ID + CATEGORY_CHEEKS + "51";

    @Description(ID_52)
    public static final String EXPECTED_URL_PRODUCT_ID_52 = URL_PRODUCT_ID + CATEGORY_CHEEKS + "52";
}
