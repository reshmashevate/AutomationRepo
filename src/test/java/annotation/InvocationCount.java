package annotation;

import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 50, invocationTimeOut = 100)
    public void testCase(){
        System.out.println("test case");

        }
    }

