package com.bridgelabz.facebook.scripts;

import com.bridgelabz.facebook.generic.BaseTest;
import com.bridgelabz.facebook.generic.Library;
import com.bridgelabz.facebook.pompages.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import static com.bridgelabz.facebook.generic.IAutoConstant.CONFIG_PATH;

//u@Listeners(CustomerListener.class)
public class TestFaceBook extends BaseTest {

    @Test
    public void testFaceBookLogin() throws InterruptedException, AWTException {

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        FacebookLogout facebookLogout = new FacebookLogout(driver);
        FacebookHomePage facebookHomePage = new FacebookHomePage(driver);

        Library config = new Library();

        facebookLoginPage.setEmail(config.getProperty(CONFIG_PATH,"username"));
        //   Thread.sleep(2000);
        facebookLoginPage.setPassword(config.getProperty(CONFIG_PATH,"password"));
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

    @Test
    public void testCaptureScreenshotFacebookPage() throws IOException {

        Date date = new Date();
        String date1 = date.toString();
        System.out.println(date1);
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
      //  File destFile = new File("/home/admin1/FaceBookTestWithSelenium/src/test/java/com/bridgelabz/facebook/Screenshot/" + date2 + "__actiTIMELoginPage.png");
        File destFile = new File("C:\\Users\\user\\IdeaProjects\\FaceBookTestWithSelenium\\src\\test\\java\\com\\bridgelabz\\facebook\\Screenshot\\" + date2 + "_actiTIMELoginPage.png");
        FileUtils.copyFile(srcFile,destFile);
    }

    @Test
    public void testUploadProfilePicture() throws InterruptedException, AWTException {
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        FacebookLogout facebookLogout = new FacebookLogout(driver);
        FacebookHomePage facebookHomePage = new FacebookHomePage(driver);
        FacebookChangeProfilePic facebookChangeProfilePic = new FacebookChangeProfilePic(driver);

        Library config = new Library();
        System.out.println(config.getProperty(CONFIG_PATH,"username"));
        facebookLoginPage.setEmail(config.getProperty(CONFIG_PATH,"username"));
        //   Thread.sleep(2000);
        facebookLoginPage.setPassword(config.getProperty(CONFIG_PATH,"password"));
        //    Thread.sleep(2000);
        facebookLoginPage.clickLogin();
        Thread.sleep(3000);

        facebookChangeProfilePic.profileClick();
        Thread.sleep(3000);
        facebookChangeProfilePic.displayPicClick();
        Thread.sleep(5000);
        Robot robot = new Robot();
        robot.mouseMove(484, 275);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        for (int j = 1; j < 11; j++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(500);
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
        Thread.sleep(5000);

        facebookChangeProfilePic.profilePostClick();
        Thread.sleep(5000);
    }

    @Test
    public void testDownLoadingImage() throws InterruptedException, AWTException {
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.mouseMove(484, 325);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK );
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
    }

    @Test
    public void testAutoInputDate() throws InterruptedException {
        FacebookDate facebookDate=new FacebookDate(driver);
        facebookDate.day();
        facebookDate.month();
        facebookDate.year();
        Thread.sleep(5000);
    }
}





