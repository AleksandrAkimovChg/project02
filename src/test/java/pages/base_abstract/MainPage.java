package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.apparel_and_accessories.ApparelAndAccessoriesPage;
import pages.home.HomePage;
import pages.makeup.CheeksPage;

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

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Skincare')]")
    private WebElement skincareMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Fragrance')]")
    private WebElement fragranceMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Men')]")
    private WebElement menMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Hair Care')]")
    private WebElement haircareMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Books')]")
    private WebElement booksMenu;

    @FindBy(xpath = CATEGORYMENU + CONTAINS + "'Cheeks')]")
    private WebElement cheeksSubmenu;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public HomePage mouseHoverOnCategoryMenu() {
        mouseHover(makeupMenu);
        return new HomePage(getDriver());
    }

    public ApparelAndAccessoriesPage clickApparelAndAccessoriesCategoryMenu() {
       click(apparelAccessoriesMenu);

        return new ApparelAndAccessoriesPage(getDriver());
    }

    public CheeksPage mouseHoverOnSubMenu() {
        mouseHoverAndClick(cheeksSubmenu);
        return new CheeksPage(getDriver());
    }
}
