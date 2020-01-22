package com.bridgelabz.facebook.pompages;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_KEY;
import static com.bridgelabz.facebook.generic.IAutoConstant.CHROME_VALUE;

public class OTPHandleAmazone {
    public static final String ACCOUNT_SID = "AC0da5e5b22cefb3d106bd8ada0cf6275e";
    public static final String AUTH_TOKEN = "dd895cfde90989ccee929be02c96cea6";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
        driver.findElement(By.xpath("//a[@class='nav-a']")).click();

        driver.findElement(By.id("ap_customer_name")).sendKeys("Upendra Sahu");
        driver.findElement(By.id("auth-country-picker-container")).click();
        driver.findElement(By.linkText("United States +1")).click();
        driver.findElement(By.id("ap_phone_number")).sendKeys("4016220124");
        driver.findElement(By.id("ap_password")).sendKeys("TestAutomation@123");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(5000);

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        String smsBody = getMessage();
        System.out.println(smsBody);

        driver.findElement(By.xpath("//input[@id='auth-pv-enter-code']")).sendKeys(smsBody);
    }


    public static String getMessage() {
        return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
                .filter(m -> m.getTo().equals("+14016220124")).map(Message::getBody).findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static Stream<Message> getMessages() {
        ResourceSet<Message> message = Message.reader(ACCOUNT_SID).read();
        return StreamSupport.stream(message.spliterator(), false);
    }
}
