package com.bridgelabz.facebook.generic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.bridgelabz.facebook.generic.IAutoConstant.*;

public class BaseTest {
    public WebDriver driver;

    static {
        System.setProperty(GECKO_KEY, GECKO_VALUE);
        System.setProperty(CHROME_KEY, CHROME_VALUE);
    }

    @BeforeTest
    public void setUp() {

        Library config = new Library();
        if ((config.getProperty(CONFIG_PATH, "browser")).equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");

            driver = new ChromeDriver(options);
            String url = Library.getProperty(CONFIG_PATH, "URL");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(url);
            String ITO = Library.getProperty(CONFIG_PATH, "ImplicitTimeOut");
            int timeoutPeriod = Integer.parseInt(ITO);
            driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
        }
        else if ((config.getProperty(CONFIG_PATH, "browser")).equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            String url = Library.getProperty(CONFIG_PATH, "URL");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(url);
        }
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}

