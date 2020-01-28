package com.bridgelabz.facebook.pompages;

import com.bridgelabz.facebook.generic.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.bridgelabz.facebook.generic.IAutoConstant.GECKO_KEY;
import static com.bridgelabz.facebook.generic.IAutoConstant.GECKO_VALUE;

class RadioButtonForLoop extends BaseTest {

    public static void main(String[] args) {

        System.setProperty(GECKO_KEY, GECKO_VALUE);
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        for (int i=0; i<elements.size();i++){
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }
    }
}
