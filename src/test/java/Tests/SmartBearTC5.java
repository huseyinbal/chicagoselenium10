package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class SmartBearTC5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        SmartBearTC4.loginToSmart(driver);
/**
 * 1. Open browser and login to Smartbear Software
 * 2. Click on View all orders
 * 3. Verify Susan McLaren has order on date “01/05/2010”
 * TASK:
 * 1. Create method verifyOrder that takes WebDriver object and String(name). This
 * method should verify if given name exists in orders.
 */
        WebElement ViewAllOrders=driver.findElement(By.xpath("//a[.='View all orders']"));
        ViewAllOrders.click();
        WebElement dateText=driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));
        String date=dateText.getText();
        if(date.equals("01/05/2010")){
            System.out.println("Verified");
        }else{
            System.out.println("Fail");
        }

verifyOrder(driver,"Paul Brown");
        System.out.println("=========================================================");
        printAllNames(driver);
    }
    /**
     * Create method verifyOrder that takes WebDriver object and String(name). This
     * method should verify if given name exists in orders.
     */
    public static void verifyOrder(WebDriver driver, String name){
      List<WebElement> names=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
    //tr is representing table rows which evert tr means each row
        for(WebElement nameCheck:names){
            if(nameCheck.getText().equals(name)){
                System.out.println("Name exists in order list");
                return;

            }



        }System.out.println("Sorry the name is missing");

    }

    /**
     * Create method printAllNames that takes WebDriver object. This method should
     * simply print all the names in the List of All Orders.
     * @param driver
     */
    public static void printAllNames(WebDriver driver){
        List<WebElement> names=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement print:names){
            System.out.println(print.getText());
        }
    }
}