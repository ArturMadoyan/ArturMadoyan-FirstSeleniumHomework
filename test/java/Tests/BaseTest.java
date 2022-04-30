package Tests;

import InitDriver.Init;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest {
    protected WebDriver driver;

    @Before
    public void initDriver() {
        Init initDriver = new Init();
        driver = initDriver.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
