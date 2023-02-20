package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.ProductsPage;

import java.util.List;

public class HomePage extends ProductsPage<HomePage> {

    private static final String POPULARBRANDS_MENU = "//section[@id='popularbrands']";
    private static final String BRANDCAROUSAL_POPULARBRANDS_MENU_HREF = POPULARBRANDS_MENU + "//ul[@id='brandcarousal']/li//a[@href]";
    private static final String BRANDCAROUSAL_POPULARBRANDS_MENU_IMG = POPULARBRANDS_MENU + "//ul[@id='brandcarousal']/li//a/img[@alt]";

    @FindBy(xpath = BRANDCAROUSAL_POPULARBRANDS_MENU_HREF)
    private List<WebElement> brandsscrollinglistHreflinks;

    @FindBy(xpath = BRANDCAROUSAL_POPULARBRANDS_MENU_IMG)
    private List<WebElement> brandsscrollinglistImglinks;

    @FindBy(xpath = POPULARBRANDS_MENU)
    private WebElement brandScrollingList;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    protected HomePage createProductsPage() {

        return new HomePage(getDriver());
    }

    public List<WebElement> getBrandsScrollingListHrefLinks() {

        return brandsscrollinglistHreflinks;
    }

    public List<WebElement> getBrandsScrollingListImgLinks() {

        return brandsscrollinglistImglinks;
    }

    public String getAltText(int index) {

        return getAttributeByIndex(index, getBrandsScrollingListImgLinks(), "alt");
    }

    public String getHref(int index) {

        return getAttributeByIndex(index, getBrandsScrollingListHrefLinks(), "href");
    }

    public String getTopMenuTextByIndex(int index) {

        return getAttributeByIndex(index, getTopMenuHrefLinks(), "text");
    }

    public String getTopMenuHrefByIndex(int index) {

        return getAttributeByIndex(index, getTopMenuHrefLinks(), "href");
    }
}
