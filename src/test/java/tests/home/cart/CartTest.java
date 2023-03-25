package tests.home.cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.home.cart.CartPage;
import utils.TestUtils;

import static testData.ProjectConstants.CART_PAGE_URL;

public class CartTest extends BaseTest {

    @Test(priority = -4)
    public void testClickLeftNavTopCartLink_NavigatesToCart() {
        final String expectedTitle = "Shopping Cart";
        final String expectedURL = CART_PAGE_URL;

        String oldURL = openBaseURL().getURL();

        CartPage cartPage = openBaseURL().clickLeftNavTopCartMenu();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());
        Assert.assertEquals(cartPage.getURL(), expectedURL);
        Assert.assertEquals(cartPage.getTitle(), expectedTitle);
    }

    @Test(priority = -5)
    public void testClickAddToCartButton_savesProduct1ToCart() {
        HomePage homePage = openBaseURL()
                .clickAddToCart_GridProduct1();

        String gridProductName = TestUtils.capitalizeEachWordInString(
                homePage.getGridProduct1_Name()
                        .toLowerCase()
        );
        String gridProductPrice = homePage.getGridProduct1_Price();

        CartPage cartPage = homePage
                .clickLeftNavTopCartMenu();

        String ProductInCartName = cartPage
                .getGridProduct1_inCartName();
        String ProductInCartPrice = cartPage
                .getGridProduct1_inCartPrice();

        Assert.assertEquals(ProductInCartName, gridProductName);
        Assert.assertEquals(ProductInCartPrice, gridProductPrice);
    }
}
