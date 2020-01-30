package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_KEY;
import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_VALUE;

public class ToolTip {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "http://demo.guru99.com/test/social-icon.html";
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTooltip = "Github";

        // Find the Github icon at the top right of the header
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

        //get the value of the "title" attribute of the github icon
        String actualTooltip = github.getAttribute("title");
        Thread.sleep(5000);
        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip" + actualTooltip);
        if (actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        driver.close();
    }

}
