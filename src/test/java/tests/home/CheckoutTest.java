package tests.home;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.CheckoutPage;
import pages.home.cart.CartPage;

import static testData.ProjectConstants.CHECKOUT_PAGE_URL;

public class CheckoutTest extends BaseTest {

    @Test(priority = -5)
    public void testClickBothCheckoutButtons_navigatesToCheckOutPage_ifUserIsSignedIn() {
        final String expectedURL = CHECKOUT_PAGE_URL;
        final String expectedTitle = "Checkout Confirmation";

        openBaseURL().BaseLogIn();

        CartPage cartPage = openBaseURL()
                .clickAddToCart_GridProduct1()
                .clickLeftNavTopCartMenu();

        String oldURL = cartPage.getURL();

        cartPage.clickCartCheckoutButton1();

        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        String actual1URL = checkoutPage.getURL();
        String actual1Title = checkoutPage.getTitle();

        cartPage.clickLeftNavTopCartMenu().clickCartCheckoutButton2();
        String actual2URL = checkoutPage.getURL();
        String actual2Title = checkoutPage.getTitle();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl());

        Assert.assertEquals(actual1URL, expectedURL);
        Assert.assertEquals(actual1Title, expectedTitle);

        Assert.assertEquals(actual2URL, expectedURL);
        Assert.assertEquals(actual2Title, expectedTitle);
    }
}
