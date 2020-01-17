package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {

    @FindBy(xpath = "//*[@name='xhpc_message']")
    private WebElement clickOnPostDialogBox;

    @FindBy(xpath = "//div[@class='_1mf _1mj']")
    private WebElement inputStatus;

    @FindBy(xpath= "//input[@class='_n _5f0v' and @name='composer_photo[]']")
    private WebElement photoVideoBtn;

    @FindBy(xpath= "//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")
    private WebElement postBottom;

    public FacebookHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnPostDialogBox() {
        clickOnPostDialogBox.click();
    }

    public void inputStatus() {
        inputStatus.sendKeys("hi ,Uploading image for testing");
    }

    public void clickPhotoVideo() {
        photoVideoBtn.click();
    }

    public void postBottom() {
        postBottom.click();
    }
}
