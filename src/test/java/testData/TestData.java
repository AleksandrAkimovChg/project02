package testData;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "BrandsScrollingList")
    public static Object[][] brandsScrollingList() {

        return new Object[][]{
                {0, "Benefit", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=12",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=12", "Benefit"},
                {1, "Pantene", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=17",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=17", "Pantene"},
                {2, "M·A·C", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=11",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=11", "M·A·C"},
                {3, "Lancôme", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=15",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=15", "Lancôme"},
                {4, "Gucci", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=20",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=20", "Gucci"},
                {5, "Giorgio Armani", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=19",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=19", "Giorgio Armani"},
                {6, "Dove", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=18",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=18", "Dove"},
                {7, "Calvin Klein", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=13",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=13", "Calvin Klein"},
                {8, "Bvlgari", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=14",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=14", "Bvlgari"},
                {9, "Sephora", "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=16",
                        "https://automationteststore.com/index.php?rt=product/manufacturer&manufacturer_id=16", "Sephora"}
        };
    }

    @DataProvider(name = "TopMenu")
    public static Object[][] topMenuLinks() {

        return new Object[][]{
                {0, " Specials", "https://automationteststore.com/index.php?rt=product/special",
                        "https://automationteststore.com/index.php?rt=product/special", "Special Offers"},
                {1, " Account", "https://automationteststore.com/index.php?rt=account/account",
                        "https://automationteststore.com/index.php?rt=account/account", "My Account"},
                {2, " Cart", "https://automationteststore.com/index.php?rt=checkout/cart",
                        "https://automationteststore.com/index.php?rt=checkout/cart", "Shopping Cart"},
                {3, " Checkout", "https://automationteststore.com/index.php?rt=checkout/shipping",
                        "https://automationteststore.com/index.php?rt=checkout/confirm", "Checkout Confirmation"}
        };
    }

    @DataProvider(name = "FooterMenuList")
    public static Object[][] footerMenuList() {

        return new Object[][] {
                {0, "About Us", "https://automationteststore.com/index.php?rt=content/content&content_id=1",
                        "https://automationteststore.com/index.php?rt=content/content&content_id=1", "About Us"},
                {1, "Privacy Policy", "https://automationteststore.com/index.php?rt=content/content&content_id=2",
                        "https://automationteststore.com/index.php?rt=content/content&content_id=2", "Privacy Policy"},
                {2, "Return Policy", "https://automationteststore.com/index.php?rt=content/content&content_id=3",
                        "https://automationteststore.com/index.php?rt=content/content&content_id=3", "Return Policy"},
                {3, "Shipping", "https://automationteststore.com/index.php?rt=content/content&content_id=4",
                        "https://automationteststore.com/index.php?rt=content/content&content_id=4", "Shipping"},
                {4, "Contact Us", "https://automationteststore.com/index.php?rt=content/contact",
                        "https://automationteststore.com/index.php?rt=content/contact", "Contact Us"},
                {5, "Site Map", "https://automationteststore.com/index.php?rt=content/sitemap",
                        "https://automationteststore.com/index.php?rt=content/sitemap", "Site Map"},
                {6, "Login", "https://automationteststore.com/index.php?rt=account/login",
                        "https://automationteststore.com/index.php?rt=account/login", "Account Login"}
        };
    }
}
