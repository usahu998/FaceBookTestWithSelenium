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

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")
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


