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

import java.util.List;

public abstract class MainPage extends BasePage {

    //   TODO
//    локаторы logo top footer navbar category
    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";

//    breadcrumbs

    private static final String CATEGORYMENU = "//section[@id='categorymenu']";
    private static final String NAV_PILLS_CATEGORYMENU = CATEGORYMENU + "/nav/ul/li";

    private static final String CONTAINS = "//a[contains(text(),";


    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(1) > a")
    private WebElement homeMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(2) > a")
    private WebElement apparelAccessoriesMenu;

    @FindBy(css = "#categorymenu > nav > ul > li:nth-child(3) > a")
    private WebElement makeupMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Cheeks')]")
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

    public List<WebElement> getNavPillsCategoryMenu() {

        return navPillsCategoryMenu;
    }
}
