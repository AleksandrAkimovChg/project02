package tests.product_list;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.product_list.NewLadies_Sandals_ID116_Page;

import static testData.ProjectConstants.*;

public class NewLadies_Sandals_ID116_Test extends BaseTest {

    @Test
    public void testNavigatesToNewLadiesSandals_ID116_Page() {

        ApparelAndAccessoriesPage apparelAndAccessoriesPage =
                new ApparelAndAccessoriesPage(getDriver());

        NewLadies_Sandals_ID116_Page
                newLadies_Sandals_ID116_Page =
                new NewLadies_Sandals_ID116_Page(getDriver());

        String oldURL = openBaseURL()
                .clickApparelAndAccessoriesMenu().getURL();

        apparelAndAccessoriesPage
                .clickNewLadiesSandals();

        String actualURL =
                newLadies_Sandals_ID116_Page
                        .getURL();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_PRODUCT_ID_116);
    }
}
