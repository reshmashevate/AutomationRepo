package testng;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExampleITestListener.class)
public class GeneratorExtentReports {

    ExtentReports extentReports = new ExtentReports();
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReports.html");
    ExtentTest extentTest;

    @BeforeMethod
    void beforeMethod(){
        extentReports.attachReporter(sparkReporter);
    }
    @Test
    public void testCase1(){
        extentTest = extentReports.createTest("Lunch the browser").assignAuthor("Sanavi").assignDevice("chrome");
        extentTest.fail("Test case is fail");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "testCase1")
    public void testCase2(){
        extentTest = extentReports.createTest("Launch the browser").assignAuthor("Archana").assignDevice("firefox");
        extentTest.fail("Test case is Fail");
        Assert.assertTrue(false);
    }
    @Test
    public void testCase3(){
        extentTest = extentReports.createTest("Launch the browser").assignAuthor("Kavita").assignDevice("edge");
        extentTest.pass("Test case is Pass");
        Assert.assertTrue(true);
    }
    @Test
    public void testCase4(){
        extentTest = extentReports.createTest("Launch the browser").assignAuthor("Renuka").assignDevice("chrome");
        extentTest.pass("Test case is Pass");
        Assert.assertTrue(true);
    }
    @AfterMethod
    void afterTest(){
        extentReports.flush();
    }
}
