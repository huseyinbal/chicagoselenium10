package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBearTC2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        negativeLogin(driver, "tes", "hhhh");

//        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
//        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
//        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
//
//        username.sendKeys("Tester");
//        password.sendKeys("");
//        loginBtn.click();
//        WebElement error = driver.findElement(By.id("ctl00_MainContent_status"));
//        if (error.getText().equals("Invalid Login or Password.")) {
//            System.out.println("Error page verified");
//        } else {
//            System.out.println("not passed");
//        }
    }
        public static void negativeLogin(WebDriver driver, String usernameValue, String passwordValue){
            driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
            WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
            WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
            WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
            username.clear();
            username.sendKeys(usernameValue);
            password.clear();
            password.sendKeys(passwordValue);
            loginBtn.click();
            WebElement error = driver.findElement(By.id("ctl00_MainContent_status"));
            if (error.getText().equals("Invalid Login or Password.")) {
                System.out.println("Error page verified");
            } else {
                System.out.println("not passed");
            }
        }

    }
