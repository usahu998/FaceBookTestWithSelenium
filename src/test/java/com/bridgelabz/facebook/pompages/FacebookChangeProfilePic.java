package com.bridgelabz.facebook.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookChangeProfilePic {
    //input[@id='js_2hf']
    @FindBy(xpath= "//span[@class='_1vp5']")
    private WebElement profileClick;

    @FindBy(xpath= "//div[@class='_156n _23fw _1o59']")
    private WebElement displayPicClick;

    @FindBy(xpath= "//a[@id='u_8m_3']")
    private WebElement uploadPhotoClick;
    //button[@class='_4jy0 _4jy3 _4jy1 _51sy selected _42ft']

    @FindBy(xpath= "//button[@class='_4jy0 _4jy3 _4jy1 _51sy selected _42ft']")
    private WebElement profilePostClick;



    public FacebookChangeProfilePic(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void profileClick() {
        profileClick.click();
    }

    public void displayPicClick() {
        displayPicClick.click();
    }
    public void uploadPhotoClick() {
        uploadPhotoClick.click();
    }
    public void profilePostClick() {
        profilePostClick.click();
    }


}
