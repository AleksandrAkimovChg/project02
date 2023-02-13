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
import pages.men.SkincarePage;

public abstract class MainPage extends BasePage {
   
//   TODO
//    локаторы logo top footer navbar category
    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";

//    breadcrumbs

    private static final String CATEGORYMENU = "//section[@id='categorymenu']";
    private static final String CONTAINS = "//a[contains(text(),";

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Home')]")
    private WebElement homeMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Apparel & accessories')]")
    private WebElement apparelAccessoriesMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Makeup')]")
    private WebElement makeupMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Cheeks')]")
    private WebElement cheeksSubmenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Skincare')]")
    private WebElement skincareMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Fragrance')]")
    private WebElement fragranceMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(6) > a")
    private WebElement menMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Hair Care')]")
    private WebElement haircareMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Books')]")
    private WebElement booksMenu;

    @FindBy(xpath = "//a/img[@src='resources/image/18/7a/8.png']")
    private WebElement logoImage;

    @FindBy(xpath = "//a/img[@title='Automation Test Store']")
    private WebElement logoTitle;

    @FindBy(xpath = "//a/img[@alt='Automation Test Store']")
    private WebElement logoText;

    @FindBy(xpath = "//div/a[@href='https://automationteststore.com/']")
    private WebElement logoHref;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public ApparelAndAccessoriesPage clickApparelAndAccessoriesCategoryMenu() {
        click(apparelAccessoriesMenu);

        return new ApparelAndAccessoriesPage(getDriver());
    }

    public MakeupPage clickMakeupCategoryMenu() {
        click(makeupMenu);

        return new MakeupPage(getDriver());
    }

    public SkincarePage clickSkincareCategoryMenu() {
        click(skincareMenu);

        return new SkincarePage(getDriver());
    }

    public FragrancePage clickFragranceCategoryMenu() {
        click(fragranceMenu);

        return new FragrancePage(getDriver());
    }

    public MenPage clickMenMenu() {
        click(menMenu);

        return new MenPage(getDriver());
    }

    public HairCarePage clickHairCareCategoryMenu() {
        click(haircareMenu);

        return new HairCarePage(getDriver());
    }

    public BooksPage clickBooksCategoryMenu() {
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
}