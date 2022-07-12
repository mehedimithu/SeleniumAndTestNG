package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {

    @BeforeMethod
    public void beforeTest() {
        System.out.println("This will be execute before run each of the test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will be execute after run each of the test");

    }

    @Test
    public void test1() {
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is running");
    }
}
