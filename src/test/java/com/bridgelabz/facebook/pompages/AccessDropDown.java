package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_KEY;
import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_VALUE;

public class AccessDropDown {
    public static void main(String[] args) {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        String baseURL = "http://demo.guru99.com/test/newtours/register.php";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        //Selecting Items in a Multiple SELECT elements
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
    }
}
