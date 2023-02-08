package pages.base_abstract;

import org.openqa.selenium.WebDriver;

public abstract class MainPage extends BasePage {

//   TODO
//    локаторы logo top footer navbar categiry
    final static String MAIN_CONTAINER = "//div[@id='maincontainer']";

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
