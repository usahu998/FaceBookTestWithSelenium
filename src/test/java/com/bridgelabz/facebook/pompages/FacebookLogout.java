package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogout {

    @FindBy(xpath = "//div[@id='userNavigationLabel']")
    private WebElement userNavigationLabel;

    @FindBy(xpath = "//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")
    private WebElement logoutBtn;

    public FacebookLogout(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void userNavigationLabel() {
        userNavigationLabel.click();
    }

    public void logoutBtn() {
        logoutBtn.click();
    }
}
