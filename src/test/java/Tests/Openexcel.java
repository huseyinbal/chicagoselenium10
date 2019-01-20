package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Openexcel {
    public static void main (String [] args){


        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.get("http://openxcell.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
       WebElement cs= driver.findElement(By.linkText("Case Studies"));
        System.out.println(cs.getAttribute("class"));
        System.out.println(cs.getText());

        List<WebElement> links=driver.findElements(By.xpath("//body//a"));
        for (WebElement link:links){
            System.out.println(link.getText());
        }



    }

}
