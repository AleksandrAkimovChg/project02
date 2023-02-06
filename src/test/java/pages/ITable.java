package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public interface ITable {

//    интерфейс для, например, https://automationteststore.com/index.php?rt=checkout/

    By TH_TAGS = By.xpath("//table[@class='table table-striped table-bordered']/tbody/tr/th");

    WebDriver driver = new ChromeDriver();

    static List<WebElement> getThTags() {

        return driver.findElements(TH_TAGS);
    }

    default List<String> getTextListThTags() {

        List<String> allTh = new ArrayList<>();

        for (WebElement th : getThTags()) {
            allTh.add(th.getText());
        }

        return allTh;
    }
}
