package tests.product_list;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;

import static testData.ProjectConstants.*;

public class WomensStilettoSandals_ID118_Test extends BaseTest {

    @Test
    public void testNavigatesToWomensStilettoSandals_ID118_Page() {

        ApparelAndAccessoriesPage apparelAndAccessoriesPage =
                new ApparelAndAccessoriesPage(getDriver());

        String oldURL = openBaseURL()
                .clickApparelAndAccessoriesMenu().getURL();

        String actualURL = apparelAndAccessoriesPage
                .clickWomensStilettoSandals()
                        .getURL();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, EXPECTED_URL_PRODUCT_ID_118);
    }
}
