package annotation;

import org.asynchttpclient.filter.IOExceptionFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExpectedException {

    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sagar/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @Test(expectedExceptions = {ArithmeticException.class, IOException.class}, groups = "smoke")
    public void testCaseA() {
        System.out.println("test case A");
        System.out.println(20/0);
        System.out.println("Hello");
    }
    @Test(description = "This is a test case for the login")     //Description Method
    public void testCaseB(){
        System.out.println("test case B");
    }
    @Test
    public void testCaseC(){
        System.out.println("test caseC");
        driver.close();
    }




}
