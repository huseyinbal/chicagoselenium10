package waits;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table extends TestBase {
    @Ignore
    @Test
    public void amazonTest(){

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("http://amazon.com");//if we dont specify load wait time "get" method waits unlimited
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement w=driver.findElement(By.id("whatever")); //it throws element if it cant find element in 10 seconds.
        /**
         * Every time you use findElement or findElements driver tries to find (timeout is only for locating elements)
         * element  within given seconds. If the element is found in 2 seconds it doesn't wait 10 seconds.
         *
         * Putting implicitlyWait after launching browser is enough for whole class. You don't have to put it for every test.
         */





    }

/** * Explicit Wait:
            * Can be used to wait for certain condition
         * Wait until element is visible, available, ....
            *
            * WebDriverWait is the class represents the explicit wait.
            * Syntax: WebDriverWait wait=new WebDriverWait(driver, time);
 * =============>This will be applied to just one certain element for a certain condition.
            */

    @Test
    public void waitExplicit()  {
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[.='Start']")).click();
        WebDriverWait wait=new WebDriverWait(driver, 10);
        WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[.='Hello World']")));

        System.out.println(message.getText());
    }
}
