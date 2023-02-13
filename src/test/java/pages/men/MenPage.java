package pages.men;

import org.openqa.selenium.WebDriver;
import pages.base_abstract.ProductsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.*;

import java.util.List;

public class MenPage extends ProductsPage<MenPage> {

    @FindBy(xpath = "//div[@class='subcategories']//a")
    private List<WebElement> menMenuList;

    public MenPage(WebDriver driver) {
        super(driver);
    }

    protected MenPage createProductsPage() {

        return new MenPage(getDriver());
    }

    public List<WebElement> getMenMenuList() {

        return this.menMenuList;
    }
}
