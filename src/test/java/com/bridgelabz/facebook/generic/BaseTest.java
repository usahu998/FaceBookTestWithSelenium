package com.bridgelabz.facebook.generic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

    @AfterMethod
    public void close() {
        /*driver.quit();*/
    }

    public void takeScreenshot(String testname) {
        Date d = new Date();
        String currentdate = d.toString().replaceAll(":", "_");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("/home/admin1/FaceBookTestWithSelenium/src/test/java/com/bridgelabz/facebook/Screenshot" + currentdate + "\\" + testname + "_screenshot.png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
