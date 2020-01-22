package com.bridgelabz.facebook.pompages;

import com.bridgelabz.facebook.generic.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
       // alert.dismiss(); // is for cancel button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//thrive_headline[@class='tho_title_changed tho-viewport-triggered']//input")).sendKeys("/home/admin1/selenium/FaceBookTestWithSelenium/src/test/java/com/bridgelabz/facebook/Screenshot/Sat Jan 18 11_53_53 IST 2020__actiTIMELoginPage.png");
        Thread.sleep(5000);
    }

}
