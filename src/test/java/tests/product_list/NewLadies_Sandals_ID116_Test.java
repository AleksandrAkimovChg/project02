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
        final String expectedURL = URL_PRODUCT_ID_116;

        NewLadies_Sandals_ID116_Page
                newLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage =
                new NewLadies_Sandals_ID116_Page(getDriver());

        ApparelAndAccessoriesPage apparelAndAccessoriesPage =
                new ApparelAndAccessoriesPage(getDriver());

        openBaseURL()
                .clickApparelAndAccessoriesCategoryMenu();

        String oldURL =
                apparelAndAccessoriesPage
                        .getURL();

        apparelAndAccessoriesPage
                .clickNewLadiesSandals();

        String actualURL =
                newLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage
                        .getURL();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, expectedURL);
    }
}
