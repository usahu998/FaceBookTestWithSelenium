package com.bridgelabz.facebook.scripts;

import com.bridgelabz.facebook.generic.BaseTest;
import com.bridgelabz.facebook.generic.IAutoConstant;
import com.bridgelabz.facebook.generic.Library;
import com.bridgelabz.facebook.pompages.FacebookHomePage;
import com.bridgelabz.facebook.pompages.FacebookLoginPage;
import com.bridgelabz.facebook.pompages.FacebookLogout;
import org.testng.annotations.Test;

import static com.bridgelabz.facebook.generic.IAutoConstant.EXCEL_PATH;


public class TestFaceBook extends BaseTest {

    @Test
    public void testFaceBookLogin() throws InterruptedException {

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        FacebookLogout facebookLogout = new FacebookLogout(driver);
        FacebookHomePage facebookHomePage = new FacebookHomePage(driver);

        Library config = new Library();
        int rows = config.getRowCount(IAutoConstant.EXCEL_PATH, "Sheet1");
        for (int i = 1; i < rows; i++) {
            //User name - 1st Row and 0th Column value
            String userName = Library.getCellValue(EXCEL_PATH, "Sheet1", i, 0);
            System.out.println(userName);
            //Password - 1st Row and 1st Column value
            String password = Library.getCellValue(EXCEL_PATH, "Sheet1", i, 1);
            //Calling Methods of LoginPage
            facebookLoginPage.setEmail(userName);
            //   Thread.sleep(2000);
            facebookLoginPage.setPassword(password);
            //    Thread.sleep(2000);
            facebookLoginPage.clickLogin();
            Thread.sleep(3000);
            facebookHomePage.clickOnPostDialogBox();
            Thread.sleep(4000);
            facebookHomePage.inputStatus();
            Thread.sleep(5000);
            facebookHomePage.postBottom();
            Thread.sleep(2000);
//            facebookHomePage.clickPhotoVideo();
//            Thread.sleep(2000);
//                facebookLogout.userNavigationLabel();
//                Thread.sleep(5000);
//                facebookLogout.logoutBtn();
//                Thread.sleep(2000);


        }
    }

}

//    @DataProvider(name = "testdata")
//    public Object[][] TestDataFeed() throws Exception {
//        Library config = new Library();
//        int rows = config.getRowCount(IAutoConstant.EXCEL_PATH, "Sheet1");
//        Object[][] credentials = new Object[rows][2];
//        for (int i = 0; i < rows; i++) {
//            credentials[i][0] = config.getCellValue(IAutoConstant.EXCEL_PATH, "Sheet1", i, 0);
//            credentials[i][1] = config.getCellValue(IAutoConstant.EXCEL_PATH, "Sheet1", i, 1);
//        }
//        return credentials;
//    }

