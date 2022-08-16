package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert {

    public static WebDriver driver;

    @BeforeMethod(groups = "smoke")
    public void beforeMethod(){
        System.out.println("before method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver  = new ChromeDriver();
        driver.get("https://www.google.com");

    }
    @Test
    public void testcase1(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google", "The title should be Google");
        System.out.println("Hello");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        driver.close();
    }

}
