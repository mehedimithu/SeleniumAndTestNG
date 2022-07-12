package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 {
    @Test
    void startCar() {
        System.out.println("Car started");
//        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"}, alwaysRun = true)
    void driveCar() {
        System.out.println("Driving the car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar() {
        System.out.println("Stopped the car");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"})
    void parkCar() {
        System.out.println("Park the Car");
    }
}
