package org.launchcode.java.demos.lsn5unittesting.test;

import jdk.jfr.StackTrace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {
    public Car test_car;

    @Before public void createCarObject(){
        test_car = new Car("Honda", "Pilot", 10, 50);
    }
    @After
    public void completedTest(){
        System.out.println("Test Completed");
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
@Test
public void emptyTest(){
    assertEquals(10,10,.01);
}

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range


    //TODO: odometer is accurately set after driving
    @Test
    public void odometerSetDrivingWithinGasLevelTest(){
        test_car.drive(10);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    //TODO: can't have more gas than tank size, expect an exception

    @Test
    public void testGasTankAfterDriving(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    @Test
    public void testGasTankAfterExceedingTankRange(){
        test_car.drive(501);
        assertEquals(0, test_car.getGasTankLevel(), 10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
    test_car.addGas(5);
    fail("You have overfilled the gas tank! This car will self destruct in 10 seconds...");
    }
}
