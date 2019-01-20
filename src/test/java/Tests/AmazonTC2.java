package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  java.util.*;

public class AmazonTC2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        /**
         * 1. Go to amazon.com
         * 2. Verify number of options in departments dropdown
         * Expected: 51
         */
        List<WebElement> options=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
        int count=options.size();
        if (count==51){
            System.out.println("Test has passed");
        }else{
            System.out.println("Try to count it again");
        }
    }
}