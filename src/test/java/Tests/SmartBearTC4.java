package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;


public class SmartBearTC4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       loginToSmart(driver);
        /**
         * 6. Click on Order
         * 7. Select familyAlbum from product, set quantity to 2
         * 8. Fill address Info with Java Faker
         * name: Generate name
         * street: Generate street
         * City: Generate City
         * State: Generate state
         * Zip: Generate zip code
         */

        WebElement order = driver.findElement(By.xpath("//a[.='Order']"));
        order.click();
        WebElement product =driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select productDropdown=new Select(product);
        productDropdown.selectByVisibleText("FamilyAlbum");

        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        WebElement CustomerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));



        Faker fake = new Faker();

        quantity.sendKeys(fake.number().digit());
        CustomerName.sendKeys(fake.name().firstName());
        street.sendKeys(fake.address().streetAddress());
        city.sendKeys(fake.address().city());
        state.sendKeys(fake.address().state());
        zip.sendKeys(fake.address().zipCode().replace("-",""));

        WebElement visaButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        WebElement cardNr=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNr.sendKeys(fake.number().digits(16));
        WebElement expDate=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expDate.sendKeys("12/12/2019");
        WebElement porcessButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        porcessButton.click();


        WebElement verifyText=driver.findElement(By.xpath("//div[@class='buttons_process']//strong"));
        String messageText=verifyText.getText();
        if(messageText.equals("New order has been successfully added.")){
            System.out.println("Text verification passed");
        }else{
            System.out.println("Failed");
        }



    }

    public static void loginToSmart(WebDriver driver){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        username.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();
    }
}