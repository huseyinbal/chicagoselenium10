package pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage {

    WebDriver driver;

    public OrangeLoginPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);//this is the class which helps page object class to initialize
        //all the webelements.
    }

    @FindBy(id="txtUsername")
    public WebElement username;

    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(id="spanMessage")
    public WebElement errorMessage;

    public void login(String usernameText, String passwordText){
        username.sendKeys(usernameText);
        password.sendKeys(passwordText);
        loginBtn.click();
    }
}
