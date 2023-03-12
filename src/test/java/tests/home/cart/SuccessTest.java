package tests.home.cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.CheckoutPage;
import pages.home.cart.SuccessPage;

import static testData.ProjectConstants.SUCCSESS_PAGE_URL;

public class SuccessTest extends BaseTest {

    @Test(priority = -5)
    public void testClickConfirmOrderButtons_navigatesToCheckOutPage() throws InterruptedException {
        final String expectedURL = SUCCSESS_PAGE_URL;
        final String expectedTitle = "Your Order Has Been Processed!";
        final String expectedTH1Header = "YOUR ORDER HAS BEEN PROCESSED!";

        openBaseURL().BaseLogIn().clickHomeMenu();

        CheckoutPage checkoutPage = openBaseURL().clickAddToCart_GridProduct1()
                .clickLeftNavTopCartMenu()
                .clickCartCheckoutButton1();

        String oldURL = checkoutPage.getURL();

        checkoutPage.clickConfirmOrderButton().waitForBlueContainerDisappeared();

        SuccessPage SuccessPage = new SuccessPage(getDriver());
        String actualURL = SuccessPage.waitForBlueContainerDisappeared().getURL();
        String actualTitle = SuccessPage.waitForBlueContainerDisappeared().getTitle();
        String actualTH1Header = SuccessPage.getConfirmOrderH1HeaderText();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertEquals(expectedTH1Header, actualTH1Header);
    }
}
