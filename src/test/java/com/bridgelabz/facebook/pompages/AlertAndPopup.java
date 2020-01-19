package com.bridgelabz.facebook.pompages;

import com.bridgelabz.facebook.generic.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_KEY;
import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_VALUE;

public class AlertAndPopup extends BaseTest {
    public static void main(String[] args) {
        System.getProperty(CHROME_KEY, CHROME_VALUE);
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Alert alert= driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        //alert.dismiss();  // is for cancle button
    }

}
