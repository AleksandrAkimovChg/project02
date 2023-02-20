package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.apparel_and_accessories.TShirtsPage;
import pages.books.BooksPage;
import pages.fragrance.FragrancePage;
import pages.hair_care.HairCarePage;
import pages.home.HomePage;
import pages.home.account.AccountLoginPage;
import pages.makeup.CheeksPage;
import pages.makeup.MakeupPage;
import pages.men.MenPage;
import pages.skincare.SkincarePage;

import java.util.List;

public abstract class MainPage extends BasePage {

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    private static final String CATEGORYMENU = "//section[@id='categorymenu']";
    private static final String NAV_PILLS_CATEGORYMENU = CATEGORYMENU + "/nav/ul/li";
    private static final String HREF = "//a[@href='https://automationteststore.com/index.php?rt=product/category&path=";
    private static final String DROPDOWN_HOME_MENU = NAV_PILLS_CATEGORYMENU + "/div/ul[@id='main_menu']/li";
    private static final String TOP_MENU_HREF = "//ul[@id='main_menu_top']/li/a[@href]";

    /**
     * logo
     */
    @FindBy(xpath = "//a/img[@src='resources/image/18/7a/8.png']")
    private WebElement logoImage;

    @FindBy(xpath = "//a/img[@title='Automation Test Store']")
    private WebElement logoTitle;

    @FindBy(xpath = "//a/img[@alt='Automation Test Store']")
    private WebElement logoText;

    @FindBy(xpath = "//div/a[@href='https://automationteststore.com/']")
    private WebElement logoHref;

    /**
     * top menu
     */

    @FindBy(xpath = "//ul[@id='customer_menu_top']")
    private WebElement loginCustomerTopMenu;

    @FindBy(xpath = "//ul[@id='main_menu_top']/li/a[@class='top menu_specials']")
    private WebElement specialsTopMenu;

    @FindBy(xpath = "//ul[@id='main_menu_top']//a[@class='top menu_account']")
    private WebElement accountTopMenu;

    @FindBy(xpath = "//ul[@id='main_menu_top']/li/a[@class='top nobackground']")
    private WebElement cartTopMenu;

    @FindBy(xpath = "//ul[@id='main_menu_top']/li/a[@class='top menu_checkout']")
    private WebElement checkoutTopMenu;

    @FindBy(xpath = TOP_MENU_HREF)
    private List<WebElement> topMenuHrefLinks;

    /**
     *  currency
     */

    /**
     * navigation menu
     */
    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(1) > a")
    private WebElement homeMenu;

    @FindBy(xpath = DROPDOWN_HOME_MENU)
    private List<WebElement> dropdownHomeMenuList;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(2) > a")
    private WebElement apparelAccessoriesMenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Shoes')]")
    private WebElement apparelAndAccessoriesShoesSubMenu;
    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'T-shirts')]")
    private WebElement apparelAndAccessoriesTShirtsSubMenu;

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

    @FindBy(xpath = "//div[@title='Go']//i[@class='fa fa-search']")
    private WebElement searchField;

    /**
     * footer
     */


    public MainPage(WebDriver driver) {
        super(driver);
    }


    /**
     * logo
     */
    public WebElement getImage() {

        return logoImage;
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

    public String getLogoTitle() {
        return logoImage.getAttribute("title");
    }

    public String getLogoText() {
        return logoImage.getAttribute("alt");
    }

    public String getLogoHref() {

        return getAttribute(logoHref, "href");
    }

    /**
     * top menu
     */

    public AccountLoginPage clickAccountMenu() {
        click(accountTopMenu);

        return new AccountLoginPage(getDriver());
    }

    public AccountLoginPage clickLoginCustomerMenu() {
        click(loginCustomerTopMenu);

        return new AccountLoginPage(getDriver());
    }

    public String getLoginCustomerText() {

        return getText(loginCustomerTopMenu);
    }

    public List<WebElement> getTopMenuHrefLinks() {

        return topMenuHrefLinks;
    }


    /**
     * navigation menu
     */
    public HomePage clickHomeMenu() {
        click(homeMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnHomeMenu() {
        mouseHover(homeMenu);

        return new HomePage(getDriver());
    }

    public ApparelAndAccessoriesPage clickApparelAndAccessoriesMenu() {
        click(apparelAccessoriesMenu);

        return new ApparelAndAccessoriesPage(getDriver());
    }

    public HomePage mouseHoverOnApparelAndAccessories() {
        mouseHover(apparelAccessoriesMenu);

        return new HomePage(getDriver());
    }

    public TShirtsPage mouseHoverSubMenu() {
        mouseHoverAndClick(apparelAndAccessoriesTShirtsSubMenu);

        return new TShirtsPage(getDriver());
    }

    public MakeupPage clickMakeupMenu() {
        click(makeupMenu);

        return new MakeupPage(getDriver());
    }

    public HomePage mouseHoverOnMakeupMenu() {
        mouseHover(makeupMenu);

        return new HomePage(getDriver());
    }

    public CheeksPage mouseHoverOnCheeksSubmenu() {
        mouseHoverAndClick(cheeksSubmenu);

        return new CheeksPage(getDriver());
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

    /**
     * other
     */

    public List<String> getDropdownHomeMenuList() {

        return getListText(dropdownHomeMenuList);
    }

    public int countCategoriesDropdownHomeMenuList() {

        return getListSize(dropdownHomeMenuList);
    }

    public SearchPage clickSearchField() {
        click(searchField);

        return new SearchPage(getDriver());
    }
}