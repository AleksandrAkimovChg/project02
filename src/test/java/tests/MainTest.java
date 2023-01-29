package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test
    public void testClickStartFromHomepage() {
        String actualURL =
                openBaseURL().getURL();

        Assert.assertEquals(actualURL, getBaseUrl());
    }
}
