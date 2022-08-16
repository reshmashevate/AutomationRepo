package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTesting {

    ThreadLocal<RemoteWebDriver> driver = new ThreadLocal();
    public WebDriver getDriver(){
        return driver.get();
    }
    @BeforeMethod(groups = "smoke")
    public void beforeMethod(){
        System.out.println("before method");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sagar/Downloads/chromedriver_win32/chromedriver.exe");
        driver.set(new ChromeDriver());
        getDriver().get("https://www.google.com");
    }
    @Test
    public void testCase1() {
        System.out.println(getDriver().getTitle());
    }
    @Test(groups = "smoke")
    public void testCase2() {
        System.out.println(getDriver().getTitle());
    }
    @Test
    public void testCase3() {
        System.out.println(getDriver().getTitle());
    }
    @Test
    public void testCase4() {
        System.out.println(getDriver().getTitle());
    }
    @AfterMethod

    public void afterMethod(){
        System.out.println("after method");
        getDriver().close();
    }
}


