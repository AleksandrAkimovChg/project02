package tests.product_list;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.my_account.MyAccountPage;
import pages.product_list.NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage;

public class NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsTest extends BaseTest {

    @Test
    public void testNavigatesToNewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage() {
        final String expectedURL = "https://automationteststore.com/index.php?rt=product/product&path=68&product_id=116";
        final String expectedProductName = "New Ladies High Wedge Heel Toe Thong Diamante Flip Flop Sandals";

        NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage
                NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage =
                new NewLadiesHighWedgeHeelToeThongDiamanteFlipFlopSandalsPage(getDriver());

        ApparelAndAccessoriesPage apparelAndAccessoriesPage =
                openBaseURL()
                        .clickApparelAndAccessoriesCategoryMenu();

        String oldURL =
                apparelAndAccessoriesPage
                        .getURL();

        apparelAndAccessoriesPage.();


//                        .clickAccountMenu()
//                        .clickLoginAccountSubmenu()
//                        .clickClearInputRegularUserLogin("testtestoff940")
//                        .clickClearInputRegularUserPassword("Testoff29012003")
//                        .clickLoginButton()
//                        .getURL();

        String actualURL =

        Assert.assertNotEquals(oldURL, actualURL);

        String actualTitle = myAccountPage.getTitle();

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
