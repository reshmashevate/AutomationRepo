package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParametersUsingDataProvider {

    public static WebDriver driver;
    @DataProvider(name = "test data")
    public Object[][] dataProviderFun(){
        return new Object[][]{{"Selenium", "Pune"},{"Java","Satara"}};
    }
    @BeforeMethod
    @Parameters({"browserName"})
    public void beforeMethod(String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("chrome")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sagar\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please select correct browser name");
        }

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "test data")
    public void testcase1(String s1, String s2){
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys(s1 + " " + s2);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        driver.close();
    }
}
