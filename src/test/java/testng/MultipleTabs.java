package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MultipleTabs {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleTest() throws  InterruptedException{
        driver.get("http://the-internet.herokuapp.com/windows");
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.linkText("Elemental Selenium")).click();
        System.out.println(driver.getTitle());
        List<String> allHandles=new ArrayList<String>(driver.getWindowHandles());
        for(String s:allHandles){
            System.out.println(s);
        }
        System.out.println(driver.switchTo().window(allHandles.get(1)).getTitle());
        Thread.sleep(3000);

        driver.close();
        driver.switchTo().window(allHandles.get(0));
        System.out.println(driver.getTitle()) ;

    }

}
