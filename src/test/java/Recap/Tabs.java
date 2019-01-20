package Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Tabs {

    WebDriver driver;
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

    @Test
    public void multipleTabs(){
        driver.get("http://amazon.com");
        ((JavascriptExecutor)driver).executeScript("window.open('http://www.google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('http://www.etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('http://www.openxcell.com','_blank');");
        System.out.println(driver.getTitle());
        List<String> allHandles=new ArrayList<String>(driver.getWindowHandles());
        for(String s:allHandles){

            if(driver.switchTo().window(s).getCurrentUrl().equals("https://www.etsy.com/")){
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
        System.out.println(driver.getTitle());
    }

}
