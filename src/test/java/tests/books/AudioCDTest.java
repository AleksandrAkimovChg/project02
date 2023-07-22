package tests.books;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AudioCDTest extends BaseTest {

    @Test
    public void testNavigatesToAudioCDPage() {
        String actualTitle = openBaseURL()
                .mouseHoverOnBooksMenu()
                .clickOnAudioCDSubMenu()
                .getTitle()
                .toUpperCase();

        Assert.assertEquals(actualTitle, "AUDIO CD");
    }
}
