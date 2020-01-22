package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.By;
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
        options.setExperimentalOption("debuggerAddress","localhost:9100");
        WebDriver driver= new  ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("auth-continue")).sendKeys("@@@@");
    }
}