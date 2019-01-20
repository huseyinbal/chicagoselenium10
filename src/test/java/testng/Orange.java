package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.Assert;
import org.testng.annotations.*;


public class Orange {

    WebDriver driver;
    @BeforeClass
    public void setup(){//beforeClass test runs very first.
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }

    @BeforeMethod
    public void testSetup(){

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void testCleanup(){
        //driver.close();
    }

    @AfterClass
    public void cleaninUp(){
        driver.quit();
    }
    @Test
    public void orangeTitleVerification(){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Orange HRM title verification");
    }

    @Test
    public void orangeLoginVerification(){
        System.out.println(driver.getPageSource());
        Assert.fail("on purpose failure");
    }

    @Test
    public void orangeTest(){
        System.out.println("My first testng test");
        String title="Amazon prime";
        Assert.assertTrue(title.contains("prime"));

    }



}
