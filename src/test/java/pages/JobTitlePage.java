package pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JobTitlePage {

    private WebDriver driver;

     public JobTitlePage(){
         driver= Driver.getDriver();
         PageFactory.initElements(driver, this);

     }

}
