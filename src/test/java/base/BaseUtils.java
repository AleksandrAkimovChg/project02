package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public final class BaseUtils {

    private static WebDriver driver;

    private static final String ENV_CHROME_OPTIONS = "CHROME_OPTIONS";

    static final String PREFIX_PROP = "default.";

    private static final String PROP_CHROME_OPTIONS = PREFIX_PROP + ENV_CHROME_OPTIONS.toLowerCase();

    private static Properties properties;

    private static void initProperties() {
        if (properties == null) {
            properties = new Properties();
            if (isServerRun()) {
                properties.setProperty(PROP_CHROME_OPTIONS, System.getenv(ENV_CHROME_OPTIONS));
            } else {
                try {
                    InputStream inputStream = BaseUtils.class.getClassLoader().getResourceAsStream("local.properties");
                    if (inputStream == null) {
                        System.out.println("ERROR: The \u001B[31mlocal.properties\u001B[0m file not found in src/test/resources/ directory.");
                        System.out.println("You need to create it from local.properties.TEMPLATE file.");
                        System.exit(1);
                    }
                    properties.load(inputStream);
                } catch (IOException ignore) {
                }
            }
        }
    }

    private static final ChromeOptions chromeOptions;

    static {
        initProperties();

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        String options = properties.getProperty(PROP_CHROME_OPTIONS);
        if (options != null) {
            for (String argument : options.split(";")) {
                chromeOptions.addArguments(argument);
            }
        }

        WebDriverManager.chromedriver().setup();
    }

    static Properties getProperties() {
        return properties;
    }

    static boolean isServerRun() {
        return System.getenv("CI_RUN") != null;
    }

//    static WebDriver createDriver() {
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        return driver;
//    }

    static public WebDriver createDriver() throws IOException {
        String browserName;
        if(isServerRun()) {
            browserName = "chrome";
        } else {

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "/src/test/resources/local.properties");
            prop.load(fis);

            browserName = prop.getProperty("browser");
        }

        //properties class
//        Properties prop = new Properties();
//        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
//                + "/src/test/resources/local.properties");
//        prop.load(fis);
//        //если мавен задает переменную тогда она, если нет то берет из проперти файла
//        String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
        //считывает прерменную из проперти файла

        if(browserName.contains("chrome")) {
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            if (browserName.contains("headless")) {
                options.addArguments("headless");
            }
            driver = new ChromeDriver(options);
            driver.manage().window().setSize(new Dimension(1440, 900));  //help run full screen
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            //firefox
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }
}
