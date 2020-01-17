package com.bridgelabz.facebook.scripts;

import com.bridgelabz.facebook.generic.BaseTest;
import com.bridgelabz.facebook.generic.IAutoConstant;
import com.bridgelabz.facebook.generic.Library;
import com.bridgelabz.facebook.pompages.FacebookHomePage;
import com.bridgelabz.facebook.pompages.FacebookLoginPage;
import com.bridgelabz.facebook.pompages.FacebookLogout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static com.bridgelabz.facebook.generic.IAutoConstant.EXCEL_PATH;


public class TestFaceBook extends BaseTest {

    @Test
    public void testFaceBookLogin() throws InterruptedException, AWTException {

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        FacebookLogout facebookLogout = new FacebookLogout(driver);
        FacebookHomePage facebookHomePage = new FacebookHomePage(driver);

        Library config = new Library();

        facebookLoginPage.setEmail("7030493048");
        //   Thread.sleep(2000);
        facebookLoginPage.setPassword("lucky143");
        //    Thread.sleep(2000);
        facebookLoginPage.clickLogin();
        Thread.sleep(3000);
        facebookHomePage.clickOnPostDialogBox();
        Thread.sleep(4000);
        Robot robot = new Robot();
        WebElement clickPhotoVideo = driver.findElement(By.xpath("//input[@class='_n _5f0v' and @name='composer_photo[]']"));
        robot.mouseMove(340, 510);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


        for (int j = 0; j < 11; j++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        facebookHomePage.postBottom();
    }
}





