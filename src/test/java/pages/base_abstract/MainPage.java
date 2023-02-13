package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.home.HomePage;
import pages.makeup.CheeksPage;

public abstract class MainPage extends BasePage {

//   TODO
//    локаторы top footer navbar category
    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";

//    breadcrumbs
    private static final String CATEGORYMENU_ID
            = "//section[@id='categorymenu']//a[@href='https://automationteststore.com/index.php?rt=product/category&path=";

    @FindBy(xpath = CATEGORYMENU_ID + "//a[@href='https://automationteststore.com/']")
    private WebElement homeCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "68']")
    private WebElement apparelAccessoriesCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "36']")
    private WebElement makeupCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "43']")
    private WebElement skincareCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "49']")
    private WebElement fragranceCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "58']")
    private WebElement menCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "52']")
    private WebElement haircareCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "65']")
    private WebElement booksCategorymenu;

    @FindBy(xpath = CATEGORYMENU_ID + "36_40']")
    private WebElement cheeksSubmenu;

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

    public HomePage mouseHoverOnCategoryMenu() {
        mouseHover(makeupCategorymenu);
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