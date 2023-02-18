package tests.home;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeTest extends BaseTest {

    @Test
    public void testDropdownSubmenuNamesOnCategoryHomeMenu() {
        final List<String> expectedDropdownSubmenuNames = new ArrayList<>(
                Arrays.asList(" Specials", " Account", " Cart", " Checkout"));

        List<String> actualDropdownSubmenuNames =
                openBaseURL()
                        .mouseHoverOnHomeMenu()
                        .getDropdownHomeMenuList();

        Assert.assertEquals(actualDropdownSubmenuNames, expectedDropdownSubmenuNames);
    }

    @Test
    public void testFourCategoriesOfDropdownSubmenuNamesOnCategoryHomeMenu() {
        final int expectedCategoriesOfDropdownSubmenu = 4;

        int actualCategoriesOfDropdownSubmenu =
                openBaseURL()
                        .mouseHoverOnHomeMenu()
                        .countCategoriesDropdownHomeMenuList();

        Assert.assertEquals(actualCategoriesOfDropdownSubmenu, expectedCategoriesOfDropdownSubmenu);
    }
}
