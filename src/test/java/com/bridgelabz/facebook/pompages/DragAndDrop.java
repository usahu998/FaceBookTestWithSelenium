package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/FaceBookTestWithSelenium/Driver/chromedriver");// Property
        WebDriver driver = new ChromeDriver();// ChromeBrowser is selected dynamically for running the script // WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();// for maximizing the window driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);// switch to frame if is present otherwise no need to switch
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
        Thread.sleep(3000);
        driver.close();
    }
}
