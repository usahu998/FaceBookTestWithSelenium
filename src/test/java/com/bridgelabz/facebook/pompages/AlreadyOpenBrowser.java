package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_KEY;
import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_VALUE;

public class AlreadyOpenBrowser {
    public static void main(String[] args) {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("debuggerAddress","127.0.0.1:9018");
        WebDriver driver= new  ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        // google-chrome -remote-debugging-port=9018 --user-data-dir"/home/admin1/Downloads/google-chrome-stable_current_amd64.deb"
    }
}