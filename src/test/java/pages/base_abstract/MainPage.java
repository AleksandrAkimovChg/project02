package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.apparel_and_accessories.ShoesPage;
import pages.apparel_and_accessories.TShirtsPage;
import pages.books.BooksPage;
import pages.books.PaperbackPage;
import pages.fragrance.FragrancePage;
import pages.fragrance.WomenPage;
import pages.hair_care.ConditionerPage;
import pages.hair_care.HairCarePage;
import pages.home.HomePage;
import pages.home.account.AccountLoginPage;
import pages.home.cart.CartPage;
import pages.makeup.CheeksPage;
import pages.makeup.EyesMakeupPage;
import pages.makeup.MakeupPage;
import pages.men.BodyAndShowerPage;
import pages.men.FragranceSetsPage;
import pages.men.MenPage;
import pages.men.PreShaveAndShavingPage;
import pages.skincare.*;

import java.util.List;

import static testData.ProjectConstants.LOGIN_NAME;
import static testData.ProjectConstants.PASSWORD;

public abstract class MainPage extends BasePage {

    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";
    private static final String CATEGORYMENU = "//section[@id='categorymenu']";
    private static final String NAV_PILLS_CATEGORYMENU = CATEGORYMENU + "/nav/ul/li";
    private static final String HREF = "//a[@href='https://automationteststore.com/index.php?rt=product/category&path=";
    private static final String DROPDOWN_HOME_MENU = NAV_PILLS_CATEGORYMENU + "/div/ul[@id='main_menu']/li";
    private static final String TOP_MENU_HREF = "//ul[@id='main_menu_top']/li/a[@href]";
    private static final String FOOTER_MENU = "//ul[@class = 'info_links_footer']//a";

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
     *  left navigation menu (currency & cart)
     */

    @FindBy(xpath ="//ul[@class='nav language pull-left']")
    private WebElement currencyMenu;

    @FindBy(xpath ="//a[contains(text(),'€ Euro')]")
    private WebElement euroSubmenu;

    @FindBy(xpath ="//a[contains(text(),'£ Pound Sterling')]")
    private WebElement poundSubmenu;

    @FindBy(xpath ="//a[contains(text(),'$ US Dollar')]")
    private WebElement dollarSubmenu;

    @FindBy(xpath ="//*[@class='nav topcart pull-left']")
    private WebElement leftNavTopCartMenu;

    @FindBy(xpath ="//span[@class='cart_total']")
    private WebElement totalInleftNavTopCartMenu;

    /**
     * navigation menu
     */

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(1) > a")
    private WebElement homeMenu;

    @FindBy(xpath = DROPDOWN_HOME_MENU)
    private List<WebElement> dropdownHomeMenuList;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(2) > a")
    private WebElement apparelAccessoriesMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(3) > a")
    private WebElement makeupMenu;

    @FindBy(xpath = CATEGORYMENU + HREF + "36_40']")
    private WebElement cheeksSubmenu;

    @FindBy(xpath = CATEGORYMENU + HREF + "36_39']")
    private WebElement eyesMakeupSubmenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(4) > a")
    private WebElement skincareMenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Shoes')]")
    private WebElement apparelAndAccessoriesShoesSubMenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'T-shirts')]")
    private WebElement apparelAndAccessoriesTShirtsSubMenu;

    @FindBy(xpath = CATEGORYMENU + HREF + "43_47']")
    private WebElement skincareEyesSubmenu;

    @FindBy(xpath = CATEGORYMENU + HREF + "43_46']")
    private WebElement skincareFaceSubmenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Gift Ideas & Sets')]")
    private WebElement skincareGiftIdeasAndSetsSubmenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Hands & Nails')]")
    private WebElement skincareHandsAndNailsSubmenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Sun')]")
    private WebElement skincareSunSubmenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Conditioner')]")
    private WebElement conditionerSubmenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Paperback')]")
    private WebElement paperbackSubmenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(5) > a")
    private WebElement fragranceMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(6) > a")
    private WebElement menMenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Body & Shower')]")
    private WebElement bodyShowerSubmenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Fragrance Sets')]")
    private WebElement fragranceSetsSubmenu;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Pre-Shave & Shaving')]")
    private WebElement preShaveAndShavingSubmenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(7) > a")
    private WebElement haircareMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(8) > a")
    private WebElement booksMenu;

    @FindBy(xpath = "//div[@title='Go']//i[@class='fa fa-search']")
    private WebElement searchField;

    @FindBy(xpath = NAV_PILLS_CATEGORYMENU + "//a[contains(text(),'Women')]")
    private WebElement womenSubmenu;

    /**
     * footer
     */

    @FindBy(xpath = FOOTER_MENU)
    private List<WebElement> footerMenus;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    /**
     * logo
     */

    public WebElement getImage() {

        return logoImage;
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

    /**
     * top menu
     */

    public AccountLoginPage clickAccountMenu() {
        click(accountTopMenu);

        return new AccountLoginPage(getDriver());
    }

    public AccountLoginPage BaseLogIn() {
        clickAccountMenu().clickLoginAccountSubmenu()
                .clickClearInputRegularUserLogin(LOGIN_NAME)
                .clickClearInputRegularUserPassword(PASSWORD)
                .clickLoginButton();

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

    public String getTopMenuTextByIndex(int index) {

        return getAttributeByIndex(index, getTopMenuHrefLinks(), "text");
    }

    public String getTopMenuHrefByIndex(int index) {

        return getAttributeByIndex(index, getTopMenuHrefLinks(), "href");
    }

    /**
     *  currency % cart - left nav top menu
     */

    public HomePage mouseHoverCurrencyMenu() {
        click(currencyMenu);

        return new HomePage(getDriver());
    }
    public CartPage clickLeftNavTopCartMenu() {
        click(leftNavTopCartMenu);

        return new CartPage(getDriver());
    }

    /**
     * navigation menu
     */

    public HomePage clickHomeMenu() {
        click(homeMenu);

        return new HomePage(getDriver());
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

    public BodyAndShowerPage clickBodyAndShowerSubmenu() {
        mouseHoverAndClick(bodyShowerSubmenu);

        return new BodyAndShowerPage(getDriver());
    }

    public FragranceSetsPage clickFragranceSetsSubmenu() {
        mouseHoverAndClick(fragranceSetsSubmenu);

        return new FragranceSetsPage(getDriver());
    }

    public PreShaveAndShavingPage clickPreShaveAndShavingSubmenu() {
        mouseHoverAndClick(preShaveAndShavingSubmenu);

        return new PreShaveAndShavingPage(getDriver());
    }

    public HairCarePage clickHairCareMenu() {
        click(haircareMenu);

        return new HairCarePage(getDriver());
    }

    public BooksPage clickBooksMenu() {
        click(booksMenu);

        return new BooksPage(getDriver());
    }

    public EyesSkincarePage clickEyesSubmenu() {
        mouseHoverAndClick(skincareEyesSubmenu);

        return new EyesSkincarePage(getDriver());
    }

    public EyesMakeupPage clickEyesMakeupSubmenu() {
        mouseHoverAndClick(eyesMakeupSubmenu);

        return new EyesMakeupPage(getDriver());
    }

    public FaceSkincarePage clickFaceSubmenu() {
        mouseHoverAndClick(skincareFaceSubmenu);

        return new FaceSkincarePage(getDriver());
    }

    public GiftIdeasAndSetsPage clickGiftIdeasAndSetsSubmenu() {
        mouseHoverAndClick(skincareGiftIdeasAndSetsSubmenu);

        return new GiftIdeasAndSetsPage(getDriver());
    }

    public HandsAndNailsPage clickHandsAndNailsSubmenu() {
        mouseHoverAndClick(skincareHandsAndNailsSubmenu);

        return new HandsAndNailsPage(getDriver());
    }

    public SunPage clickSunSubmenu() {
        mouseHoverAndClick(skincareSunSubmenu);

        return new SunPage(getDriver());
    }

    public ShoesPage clickShoesSubmenu() {
        mouseHoverAndClick(apparelAndAccessoriesShoesSubMenu);

        return new ShoesPage(getDriver());
    }

    public TShirtsPage clickTShirtSubmenu() {
        mouseHoverAndClick(apparelAndAccessoriesTShirtsSubMenu);

        return new TShirtsPage(getDriver());
    }

    public CheeksPage clickCheeksSubmenu() {
        mouseHoverAndClick(cheeksSubmenu);

        return new CheeksPage(getDriver());
    }

    public PaperbackPage clickPaperbackSubmenu() {
        mouseHoverAndClick(paperbackSubmenu);

        return new PaperbackPage(getDriver());
    }

    public ConditionerPage clickConditionerSubmenu() {
        mouseHoverAndClick(conditionerSubmenu);

        return new ConditionerPage(getDriver());
    }

    public WomenPage clickWomenSubmenu() {
        mouseHoverAndClick(womenSubmenu);

        return new WomenPage(getDriver());
    }

    public HomePage mouseHoverOnHomeMenu() {
        mouseHover(homeMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnApparelAndAccessoriesMenu() {
        mouseHover(apparelAccessoriesMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnMakeupMenu() {
        mouseHover(makeupMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnSkincareMenu() {
        mouseHover(skincareMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnMenMenu() {
        mouseHover(menMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnHaircareMenu() {
        mouseHover(haircareMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnBooksMenu() {
        mouseHover(booksMenu);

        return new HomePage(getDriver());
    }

    public HomePage mouseHoverOnFragranceMenu() {
        mouseHover(fragranceMenu);

        return new HomePage(getDriver());
    }

    /**
     *  footer menu
     */

    public List<WebElement> getFooterMenuLinks() {

        return footerMenus;
    }

    public String getFooterMenuTextByIndex(int index) {

        return getAttributeByIndex(index, getFooterMenuLinks(), "text");
    }

    public String getFooterMenuHrefByIndex(int index) {

        return getAttributeByIndex(index, getFooterMenuLinks(), "href");
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
