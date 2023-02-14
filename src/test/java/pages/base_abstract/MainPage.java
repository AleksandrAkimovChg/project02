package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.books.BooksPage;
import pages.fragrance.FragrancePage;
import pages.hair_care.HairCarePage;
import pages.home.HomePage;
import pages.makeup.CheeksPage;
import pages.makeup.MakeupPage;
import pages.men.MenPage;
import pages.skincare.SkincarePage;

import java.util.List;

public abstract class MainPage extends BasePage {

//   TODO
//    локаторы logo top footer navbar category
    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";

//    breadcrumbs

    private static final String CATEGORYMENU = "//section[@id='categorymenu']";
    private static final String NAV_PILLS_CATEGORYMENU = CATEGORYMENU + "/nav/ul/li";
    private static final String  POPULARBRANDS_MENU = "//section[@id='popularbrands']";
    private static final String  BRANDCAROUSAL_POPULARBRANDS_MENU = POPULARBRANDS_MENU + "//ul[@id='brandcarousal']/li//a";

    private static final String HREF = "//a[@href='https://automationteststore.com/index.php?rt=product/category&path=";


    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(1) > a")
    private WebElement homeMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(2) > a")
    private WebElement apparelAccessoriesMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(3) > a")
    private WebElement makeupMenu;

    @FindBy(xpath = CATEGORYMENU + HREF + "36_40']")
    private WebElement cheeksSubmenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(4) > a")
    private WebElement skincareMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(5) > a")
    private WebElement fragranceMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(6) > a")
    private WebElement menMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(7) > a")
    private WebElement haircareMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(8) > a")
    private WebElement booksMenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU)
    private List<WebElement> navPillsCategoryMenu;

    @FindBy(xpath = "//a/img[@src='resources/image/18/7a/8.png']")
    private WebElement logoImage;

    @FindBy(xpath = "//a/img[@title='Automation Test Store']")
    private WebElement logoTitle;

    @FindBy(xpath = "//a/img[@alt='Automation Test Store']")
    private WebElement logoText;

    @FindBy(xpath = "//div/a[@href='https://automationteststore.com/']")
    private WebElement logoHref;

    @FindBy(xpath = POPULARBRANDS_MENU)
    private WebElement brandScrollingList;

    @FindBy(xpath = BRANDCAROUSAL_POPULARBRANDS_MENU)
    private List<WebElement> brandsScrollingListLinks;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public ApparelAndAccessoriesPage clickApparelAndAccessoriesMenu() {
        click(apparelAccessoriesMenu);

        return new ApparelAndAccessoriesPage(getDriver());
    }

    public MakeupPage clickMakeupMenu() {
        click(makeupMenu);

        return new MakeupPage(getDriver());
    }

    public SkincarePage clickSkincareMenu() {
        click(skincareMenu);

        return new SkincarePage(getDriver());
    }

    public FragrancePage clickFragranceMenu() {
        click(fragranceMenu);

        return new FragrancePage(getDriver());
    }

    public MenPage clickMenMenu() {
        click(menMenu);

        return new MenPage(getDriver());
    }

    public HairCarePage clickHairCareMenu() {
        click(haircareMenu);

        return new HairCarePage(getDriver());
    }

    public BooksPage clickBooksMenu() {
        click(booksMenu);

        return new BooksPage(getDriver());
    }

    public HomePage mouseHoverOnCategoryMenu() {
        mouseHover(makeupMenu);
        return new HomePage(getDriver());
    }

    public CheeksPage mouseHoverOnSubMenu() {
        mouseHoverAndClick(cheeksSubmenu);
        return new CheeksPage(getDriver());
    }

    public WebElement getImage() {

        return logoImage;
    }

    public List<WebElement> getNavPillsCategoryMenu() {

        return navPillsCategoryMenu;
    }

    public boolean isLogoDisplayed() {

        return isImageDisplayed(logoImage);
    }

    public boolean isLogoClickable() {
        if (logoImage.isEnabled() && logoImage.isDisplayed()) {
            return true;
        }
        return false;
    }

    public HomePage clickLogo() {
        click(logoImage);
        return new HomePage(getDriver());
    }

    public String getLogoHref() {

        return getAttribute(logoHref, "href");
    }

    public String getLogoTitle() {
        return logoImage.getAttribute("title");
    }

    public String getLogoText() {
        return logoImage.getAttribute("alt");
    }

    public List<WebElement> getBrandsScrollingListLinks() {

        return brandsScrollingListLinks;
    }

    public void clickBrandsScrollingListMenu(int index) {
        getBrandsScrollingListLinks().get(index).click();
    }

    public String getAltText(int index) {
        scrollByVisibleElement(brandScrollingList);

        return getAttributeByIndex(index, getBrandsScrollingListLinks(), "alt");
    }

    public String getHref(int index) {
        scrollByVisibleElement(brandScrollingList);

        return getAttributeByIndex(index, getBrandsScrollingListLinks(), "href");
    }
}