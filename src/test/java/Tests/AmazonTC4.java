package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonTC4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        /**
         * TC-4: Amazon departments dropdown option selection
         * 1. Go to amazon.com
         * 2. Select Courses from departments dropdown
         * 3. Verify option Courses is selected
         */

        WebElement courses=driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[23]"));
        courses.click();
        System.out.println(courses.getText());
        if(courses.getText().equals("Courses")){
            System.out.println("Courses is selected and test case passed");
        }else{
            System.out.println("It didn't pass");
        }
        verifyDepartmentDropdown(driver, "Baby");
    }
    /**
     * Task:
     * Create void method verifyDepartmentDropdown. This
     * method should accept WebDriver object and String(option).
     * Method will select given option and verifies if it’s selected.
     */
    public static void verifyDepartmentDropdown(WebDriver driver, String smth){
        driver.get("https://amazon.com");




                WebElement opt=driver.findElement(By.xpath("//option[.=smth]"));
                opt.click();



    }

}