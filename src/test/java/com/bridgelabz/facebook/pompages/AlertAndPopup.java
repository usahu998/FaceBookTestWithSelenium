package com.bridgelabz.facebook.pompages;

import com.bridgelabz.facebook.generic.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopup extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();

        if (text.equals("Please enter a valid user name")) {
            System.out.println("Correct alert Message");
        } else {
            System.out.println("Incorrect alert Message");
        }
        alert.accept();
        Thread.sleep(3000);
        //alert.dismiss();  // is for cancel button
        driver.close();
    }
}
