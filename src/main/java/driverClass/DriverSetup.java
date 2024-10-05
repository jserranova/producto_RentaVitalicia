package driverClass;

import globalVariables.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverSetup {

    public static WebDriver setupRemoteDriver(String browser) {
        WebDriver driver = null;
        try {
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            } else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            } else if (browser.equalsIgnoreCase("edge")) {
                EdgeOptions options = new EdgeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    public static WebDriver setupChromeDriver() {
        System.setProperty(GlobalVariables.WEBD_CHROME,GlobalVariables.WEBD_CHROME);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(GlobalVariables.URL_PAGE_QA);
        maximizeWindowAndSetImplicitWait(driver);
        return driver;
    }

    public static WebDriver setupFirefoxDriver() {
        System.setProperty(GlobalVariables.WEBD_FIREFOX, GlobalVariables.RUTA_FIREFOX);
        WebDriver driver = new FirefoxDriver();
        driver.get(GlobalVariables.URL_PAGE_QA);
        maximizeWindowAndSetImplicitWait(driver);
        return driver;
    }

    public static WebDriver setupEdgeDriver() {
        System.setProperty(GlobalVariables.WEBD_EDGE, GlobalVariables.RUTA_EDGE);
        WebDriver driver = new EdgeDriver();
        driver.navigate().to(GlobalVariables.URL_PAGE_QA);
        maximizeWindowAndSetImplicitWait(driver);
        return driver;
    }

    private static void maximizeWindowAndSetImplicitWait(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
