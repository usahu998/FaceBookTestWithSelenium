package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(id = "pass")
    private WebElement Password;

    @FindBy(id = "u_0_b")
    private WebElement loginBtn;

    //Initialization
    public FacebookLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String email) {
        Email.sendKeys(email);
    }

    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }
}


