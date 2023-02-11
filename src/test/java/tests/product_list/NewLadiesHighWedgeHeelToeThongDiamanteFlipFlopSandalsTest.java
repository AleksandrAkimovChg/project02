package tests.product_list;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.product_list.NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage;

public class NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsTest extends BaseTest {

    @Test
    public void testNavigatesToNewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage() {
        final String expectedURL = "https://automationteststore.com/index.php?rt=product/product&path=68&product_id=116";

        NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage
                newLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage =
                new NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage(getDriver());

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
