package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.util.List;
import java.util.stream.Collectors;

import static testData.ProjectConstants.*;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchProductByName() {
        SearchPage searchPage = openBaseURL()
                .clickSearchField()
                .clickSearchCriteriaField()
                .inputSearchCriteria(SEARCH_CRITERIA + "\n");

        List<String> productNames = searchPage.getProductNames()
                .stream()
                .map(WebElement::getText)
                .filter(name -> !name.isBlank() && (name.contains(SEARCH_CRITERIA)))
                .collect(Collectors.toList());;

        Assert.assertEquals(searchPage.getURL(), SEARCH_PAGE_URL);
        Assert.assertEquals(productNames.size(), 4);
        Assert.assertTrue(productNames.stream().allMatch(name -> name.contains(SEARCH_CRITERIA)));
    }
}
