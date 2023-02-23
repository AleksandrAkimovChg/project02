package tests.home.cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.cart.CartPage;

import static testData.ProjectConstants.CART_PAGE_URL;

public class CartTest extends BaseTest {

    @Test
    public void testClickLeftNavTopCartLink_NavigatesToCart() {
        final String expectedTitle = "Shopping Cart";
        final String expectedURL = CART_PAGE_URL;

        String oldURL = openBaseURL().getURL();

        CartPage cartPage = openBaseURL().clickLeftNavTopCartMenu();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());
        Assert.assertEquals(cartPage.getURL(), expectedURL);
        Assert.assertEquals(cartPage.getTitle(), expectedTitle);
    }
}
