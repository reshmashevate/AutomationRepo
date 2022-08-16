package testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestNGUsingExcel {

    public static WebDriver driver;

    @DataProvider(name = "test_today")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrObj = getExcelData("Desktop\\Test_today.xlsx","test_today");
        return arrObj;
    }

    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        String[][] data = null;

        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet(sheetName);
        XSSFRow row = sh.getRow(0);
        int noOfRows = sh.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();
        Cell cell;

        data = new String[noOfRows][noOfCols];

        for(int i=1; i<noOfRows; i++){
            for(int j=1; j<noOfCols; j++){
                row = sh.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
    @BeforeMethod
    @Parameters({"browserName"})
    public void beforeMethod(String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sagar\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please select correct browser name");
        }
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "test_today")
    public void testCase1(String technology, String city){
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys(technology + " " + city);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        driver.close();
    }
}
