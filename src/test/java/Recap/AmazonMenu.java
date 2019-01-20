package Recap;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AmazonMenu extends TestBase {
    //Move mouse to an element
@Ignore
    @Test
    public void amazonTitle() throws InterruptedException {
        driver.get("https://www.amazon.com/");

       Actions action=new Actions(driver);
        WebElement nav=driver.findElement(By.id("icp-nav-flyout"));
        action.moveToElement(nav).perform();
        Thread.sleep(10000);
    }

    @Ignore
    @Test
    public void doubleClick() throws InterruptedException{
    driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
    Actions action=new Actions(driver);
    WebElement clicking=driver.findElement(By.id("puff_header"));

    action.doubleClick(clicking).perform();
    Thread.sleep(3000);

    WebElement footer=driver.findElement(By.className("footer-info-left"));
    action.moveToElement(footer).perform();
    Thread.sleep(3000);


    }

    //drag and drop
    @Ignore
    @Test
    public void dragAndDrop() throws InterruptedException{
    driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    Actions action=new Actions(driver);
    WebElement source=driver.findElement(By.id("draggable"));
    WebElement target=driver.findElement(By.id("droptarget"));
    action.dragAndDrop(source,target).perform();
    Thread.sleep(3000);
    }

    //upload
    @Test
    public void upload()throws InterruptedException{
    driver.get("http://the-internet.herokuapp.com/upload");
    WebElement fileUpload=driver.findElement(By.id("file-upload"));
    Thread.sleep(4000);
    fileUpload.sendKeys("C:\\Users\\Huseyin\\Desktop\\Locators\\Locators_groups.pdf");
        Thread.sleep(4000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(10000);
    }

}
