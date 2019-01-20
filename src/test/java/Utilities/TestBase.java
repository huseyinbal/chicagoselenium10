package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestBase {
   public WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void startTest(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,SECONDS);
    }

}
