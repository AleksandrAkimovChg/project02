package tests.my_account;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyWishlistTest extends BaseTest {

    @Test
    public void testTableHeaderNames() {
        final List<String> expectedHeaderNames = new ArrayList<>(
                Arrays.asList("Image", "Name", "Model", "Unit Price", "Added to wish list", "Actions"));

        List<String> actualHeaderNames =
                openBaseURL()
                        .clickAccountMenu()
                        .clickLoginAccountSubmenu()
                        .clickClearInputRegularUserLogin("testtestoff940")
                        .clickClearInputRegularUserPassword("Testoff29012003")
                        .clickLoginButton()
                        .clickMyWishlistLink()
                        .getTableHeaders();

        Assert.assertEquals(actualHeaderNames, expectedHeaderNames);
    }
}
