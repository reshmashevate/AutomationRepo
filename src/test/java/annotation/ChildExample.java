package annotation;

import org.testng.annotations.*;

public class ChildExample {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("after suite");
    }
}
