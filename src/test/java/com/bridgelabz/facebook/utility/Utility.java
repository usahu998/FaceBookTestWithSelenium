//package com.bridgelabz.facebook.utility;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Date;
//
//public class Utility {
//    public void takeScreenshot(String testname) {
//        Date d = new Date();
//        String currentdate = d.toString().replaceAll(":", "_");
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        File destFile = new File("/home/admin1/FaceBookTestWithSelenium/src/test/java/com/bridgelabz/facebook/Screenshot" + currentdate + "\\" + testname + "_screenshot.png");
//        try {
//            FileUtils.copyFile(srcFile, destFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
