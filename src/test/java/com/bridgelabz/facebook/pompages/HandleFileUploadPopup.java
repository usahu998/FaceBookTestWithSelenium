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
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
       // alert.dismiss(); // is for cancel button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\user\\Desktop\\getandpost.png");
        Thread.sleep(5000);
    }

}
