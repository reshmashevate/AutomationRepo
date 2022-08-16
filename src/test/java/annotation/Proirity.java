package annotation;

import org.testng.annotations.Test;

public class Proirity {

    @Test
    public void testCaseA(){
        System.out.println("test case A");
    }
    @Test(priority = -3)
    public void testCaseB(){
        System.out.println("test case B");
    }
    @Test(priority = 2)
    public void testCaseC(){
        System.out.println("test case C");
    }
    @Test(priority = -1)
    public void testCaseD(){
        System.out.println("test case D");
    }
    @Test
    public void testCaseE() {
        System.out.println("test case D");

    }
}
