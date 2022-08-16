package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static testng.FirstTestNGClass.driver;

public class TestNgSoftAssert {

    public static WebDriver driver;

    @BeforeMethod(groups = "smoke")
    public void beforeMethod() {
        System.out.println("before method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
    }
    @Test(groups = {"smoke", "p0"})
    public void testcase2() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println(driver.getTitle());
        softAssert.assertEquals(driver.getTitle(), "Flipkart", "title should be online shopping site for mobile");
        softAssert.assertNotEquals(driver.getTitle(), "Flipkart", "title should not be same ");
        softAssert.assertNotNull(driver.getTitle(), "title should be null");
        softAssert.assertTrue(driver.getTitle().contains("Flipkart"), "title should contain test");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
        driver.close();
    }
}


