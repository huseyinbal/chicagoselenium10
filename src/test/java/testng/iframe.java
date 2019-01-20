package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iframe {

    /**
     * IFRAME--> independent HTML code in another HTML code.
     * HTML tag for Frames is <iframe>
     *     Selenium can only focus on ONE HTML code. If HTML code has iframe in it then Selenium
     *
     *     to find iframe ---> //iframe
     *
     *     to switch into the iframe:
     *     WebElement iframe=driver.findElement(By.tagName("iframe"))
     *     driver.switchTo().frame(iframe);
     *     driver.switchT().frame(0);
     *     driver.switchTo.frame("iframe-id");
     *     driver.switchTo.parentFrame();
     */

    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void getText() throws  InterruptedException{
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(3000);
        WebElement facebookFrame = driver.findElement(By.xpath("//div[@class='facebook-fanbox']//iframe"));
        driver.switchTo().frame(facebookFrame);
        WebElement ele = driver.findElement(By.xpath("//span[@id='u_0_6']"));
        System.out.println(ele.getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());
    }
}