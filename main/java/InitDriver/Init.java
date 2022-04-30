package InitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Init {
    WebDriver webDriver;

    public WebDriver getDriver() {
        if (null != System.getProperty("driver")) {
            String driver = System.getProperty("driver");
            if (driver.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                return webDriver;
            } else if (driver.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                return webDriver;
            }
        }
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        return webDriver;

    }
}