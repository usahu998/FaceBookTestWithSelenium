package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookDate {

    @FindBy(id = "day")
    private WebElement day;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;

    public FacebookDate(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void day() {
        day.sendKeys("15");
    }

    public void month() {
        month.sendKeys("Aug");
    }

    public void year() {
        year.sendKeys("1994");
    }
}
