package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Apple1 {

    @BeforeClass
    public void setup(){
        System.out.println("Setting up environment in before class");

    }

    @AfterClass
    public void tearDown(){
        System.out.println("Closing everrything in afteerclass annotation");
    }

    @Test (priority = 2)
    public void appleInfo(){
        System.out.println("test1 here");
        System.out.println("");
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("Test 2 runs first because we set priority 1");
        System.out.println("");
    }

    @Test (dependsOnMethods = "test2")
    public void post(){
        System.out.println("posting smth after test2");
    }

    @BeforeMethod
    public void bm(){
        System.out.println("Before every test run me");
        System.out.println("---------------------------------------------------");

    }
    @AfterMethod
    public void afm(){
        System.out.println("After Every method runs");
        System.out.println("===================================================");
    }
}
