package tests.books;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTest extends BaseTest {
    @Test
    public void testNavigatesToBooksPage() {
        String actualTitle = openBaseURL()
                .clickOnBooksMenu()
                .getTitle().toUpperCase();

        Assert.assertEquals(actualTitle, "BOOKS");
    }

    @Test
    public void testClickOnBTNListView() {
        String actualColor = openBaseURL()
                .clickOnBooksMenu()
                .clickButtonList()
                .getBackgroundColorBTNList();

        Assert.assertEquals(actualColor, "rgba(216, 66, 14, 1)");
    }
}
