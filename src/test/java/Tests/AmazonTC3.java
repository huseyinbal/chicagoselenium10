package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonTC3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        /**
         * TC-3: Amazon departments dropdown option values
         * 1. Go to amazon.com
         * 2. Verify each options in department dropdown has at least
         * 1 character.
         * Note: non of the option should be empty
         */
        List<WebElement> options=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
        for(WebElement each:options){
            if(each.getText().equals("")){
                System.out.println("Didn't pass");
                return;
            }


        } System.out.println("Passed");
    }
}