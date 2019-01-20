package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTC1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        WebElement allDepartments=driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[1]"));
        System.out.println(allDepartments.getText());
        if(allDepartments.getText().equals("All Departments")){
            System.out.println("Default value is verified");
        }else{
            System.out.println("It didn't pass");
        }

    }
}