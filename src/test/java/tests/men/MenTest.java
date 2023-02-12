package tests.men;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.men.MenPage;

import static testData.ProjectConstants.*;

public class MenTest extends BaseTest {

    @Test
    public void testNavigatesToMen_ID58_Page() {
        MenPage menPage = openBaseURL()
                .clickMenMenu();

        Assert.assertEquals(menPage.getURL(), MEN_PAGE_URL);
        Assert.assertEquals(menPage.getTitle(), MEN_PAGE_TITLE);
    }
}
