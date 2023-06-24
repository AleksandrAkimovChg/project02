package tests.home.cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.hair_care.ConditionerPage;
import pages.home.CheckoutPage;
import pages.home.cart.SuccessPage;

import java.util.List;

import static testData.ProjectConstants.SUCCESS_PAGE_URL;

public class SuccessTest extends BaseTest {

    @Test(priority = -5)
    public void testClickConfirmOrderButtons_navigatesToSuccessPage() {
        final String expectedURL = SUCCESS_PAGE_URL;
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

    /**
     * 1. Захожу на сайт
     * 2. логинюсь
     * 3. Иду в HairCareMenu
     * 4. Иду ConditionerSubmenu
     * 5. Выбираю Brunette Expression Conditioner (Id-72)
     * 6. Добавляю его в корзину
     * 7. Нажимаю на значок корзины в TopMenu
     * 8. На странице ShoppingCart нажимаю checkout
     * 9. На странице checkoutInformatin нажимаю ConfirmOrder
     * 10. Assert - проверяю надпись
     */
    @Test
    public void testSuccessInscriptionOnTheSuccessPage() {
        final String expectedTH1Header = "YOUR ORDER HAS BEEN PROCESSED!";
        final String expectedSuccessInscription = " Your Order Has Been Processed!";

        List<String> actualConditioners = openBaseURL()
                .BaseLogIn()
                .mouseHoverOnHaircareMenu()
                .clickConditionerSubmenu()
                .getConditionersList();

        if (actualConditioners.size() > 0) {
            String actualH1Header = new ConditionerPage(getDriver())
                    .mouseHoverAndClickAddToCard()
                    .clickLeftNavTopCartMenu()
                    .clickCartCheckoutButton1()
                    .clickConfirmOrderButton()
                    .waitForBlueContainerDisappeared()
                    .getConfirmOrderH1HeaderText();

        Assert.assertEquals(actualH1Header, expectedTH1Header);
        }
    }
}
