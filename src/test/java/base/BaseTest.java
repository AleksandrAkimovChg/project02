package base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.home.HomePage;
import utils.ReportUtils;

import java.io.IOException;
import java.lang.reflect.Method;

public abstract class BaseTest {

    private static final String BASE_URL = "https://automationteststore.com/";

    private WebDriver driver;

    @BeforeSuite
    protected void beforeSuite(ITestContext context) {

        Reporter.log(ReportUtils.getReportHeader(context), true);
    }

    @BeforeMethod
    protected void beforeMethod(Method method, ITestResult result) throws IOException {
        driver = BaseUtils.createDriver();

        Reporter.log(ReportUtils.END_LINE, true);
        Reporter.log("TEST RUN", true);
        Reporter.log(ReportUtils.getClassNameTestName(method, result), true);
    }

    @AfterMethod
    protected void afterMethod(Method method, ITestResult result) {
        Reporter.log(ReportUtils.getTestStatistics(method, result), true);

        driver.quit();
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public static String getBaseUrl() {

        return BASE_URL;
    }

    public HomePage openBaseURL() {
        getDriver().get(BASE_URL);

        return new HomePage(getDriver());
    }

    public String getExternalPageTitle() {

        return getDriver().getTitle();
    }

    public String getExternalPageURL() {

        return getDriver().getCurrentUrl();
    }
}
