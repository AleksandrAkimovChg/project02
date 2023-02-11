package tests.makeup;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheeksTest extends BaseTest {

    @Test
    public void testProductPriceTagChangedWhenAddedToCart() {

        Assert.assertTrue(

        openBaseURL()
                .mouseHoverOnCategoryMenu()
                .mouseHoverOnSubmenu()
                .clickAddToCart()
                .isPriceTagChanged()
        );
    }
}
