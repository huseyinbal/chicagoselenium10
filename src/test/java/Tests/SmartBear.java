package Tests;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBear {
    public static void main (String [] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        String title=driver.getTitle();
        if(title.contains("Web Orders Login")){
            System.out.println("Verified");
        }else{
            System.out.println("Not Verified");
        }

        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn=driver.findElement(By.id("ctl00_MainContent_login_button"));

        username.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();

        String newTitle=driver.getTitle();
        if(newTitle.equals("Web Orders")){
            System.out.println("Web title is verified");
        }else{
            System.out.println("Not verified");
        }
        String loginUrl=driver.getCurrentUrl();
        if(loginUrl.equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/")){
            System.out.println("Login url is verified");
        }else{
            System.out.println("not verified");
        }

    }
}
