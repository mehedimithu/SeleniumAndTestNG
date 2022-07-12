/*
  1. Setup - open browser and application
  2. login
  3. close
  */

import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority = 1)
    void setUp() {
        System.out.println("open browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("this is login test");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("close the browser");
    }


}
