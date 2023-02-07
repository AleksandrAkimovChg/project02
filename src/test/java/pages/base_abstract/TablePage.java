package pages.base_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class TablePage extends FormPage {

    @FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr/th")
    private List<WebElement> tableHeaders;


    public TablePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getTableHeaders() {

        return getListText(tableHeaders);
    }
}
