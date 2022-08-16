package annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod {

    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sagar/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    @Test(groups = "smoke", alwaysRun = true)
    public void testCaseA() {
        System.out.println("test case A");
        Assert.assertTrue(false);
    }

    @Test(dependsOnGroups = "smoke", alwaysRun = true)
    public void testCaseB() {
        System.out.println("test case B");
    }

    @Test(dependsOnMethods = "testCaseA", alwaysRun = true)
    public void testCaseC() {
        System.out.println("test case C");
    }

    @Test
    public void testCaseD() {
        System.out.println("test case D");
    }

    @Test(enabled = false)
    public void testCaseE() {
        System.out.println("test case E");
        driver.close();
    }


}