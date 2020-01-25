package com.bridgelabz.facebook.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static com.bridgelabz.facebook.generic.IAutoConstant.*;

public class BaseTest {
    public WebDriver driver;
    Logger logger = Logger.getLogger(BaseTest.class);

    static {
        System.setProperty(GECKO_KEY, GECKO_VALUE);
        System.setProperty(CHROME_KEY, CHROME_VALUE);
    }

    @BeforeTest
    public void setUp() {

        if ((Library.getProperty(CONFIG_PATH, "browser")).equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("disable-infobars");
            driver = new ChromeDriver(options);
            String url = Library.getProperty(CONFIG_PATH, "URL");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(url);
            String ITO = Library.getProperty(CONFIG_PATH, "ImplicitTimeOut");
            int timeoutPeriod = Integer.parseInt(ITO);
            driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
            logger.error("this is an error message");
            logger.warn("this is warn message");
            logger.debug("this is debug message");
            logger.info("this is info message");
        } else if ((Library.getProperty(CONFIG_PATH, "browser")).equalsIgnoreCase("firefox")) {
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

