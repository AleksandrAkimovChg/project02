package tests.product_list;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.product_list.NewLadies_Sandals_ID116_Page;

public class NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsTest extends BaseTest {

    @Test
    public void testNavigatesToNewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage() {
        final String expectedURL = "https://automationteststore.com/index.php?rt=product/product&path=68&product_id=116";

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
                .clickNewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandals();

        String actualURL =
                newLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage
                        .getURL();

        Assert.assertNotEquals(oldURL, actualURL);
        Assert.assertEquals(actualURL, expectedURL);
    }
}
