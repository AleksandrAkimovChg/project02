package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test
    public void testBaseURLLoadedSuccessfully() {
        final String expectedUrl = getBaseUrl();

        String actualUrl =
                openBaseURL()
                        .getURL();

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
