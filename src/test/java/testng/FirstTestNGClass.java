package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {



    public static WebDriver driver;

    @BeforeMethod
     public void beforeMethod(){
        System.out.println("before method");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sagar/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();


    }
    @Test
    public void testCase1() {
        System.out.println(driver.getTitle());
    }
    @Test(groups = "smoke")
    public void testCase2() {
        System.out.println(driver.getTitle());
    }
    @Test
    public void testCase3() {
        System.out.println(driver.getTitle());
    }
    @Test
    public void testCase4() {
        System.out.println(driver.getTitle());
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        driver.close();
    }
}


