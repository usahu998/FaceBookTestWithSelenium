package com.bridgelabz.facebook.pompages;

import com.bridgelabz.facebook.generic.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.bridgelabz.facebook.generic.IAutoConstant.GECKO_KEY;
import static com.bridgelabz.facebook.generic.IAutoConstant.GECKO_VALUE;

public class RadioButtonSelect extends BaseTest {
    public static void main(String[] args) {
// TODO Auto-generated method stub

        System.setProperty(GECKO_KEY, GECKO_VALUE);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/ajax.html");

// Find the radio button for “No” using its ID and click on it
        driver.findElement(By.id("no")).click();

//Click on Check Button
        driver.findElement(By.id("buttoncheck")).click();

    }

}
