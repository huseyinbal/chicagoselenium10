package PageObjectModel;

import Utilities.Config;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeLoginPage;

public class OrangeTest {

    @Test
    public void negativeLogin(){
        Driver.getDriver().get(Config.getProperty("url"));
        OrangeLoginPage olp=new OrangeLoginPage();
        olp.login(Config.getProperty("username"), Config.getProperty("invalidPass"));
        String message=olp.errorMessage.getText();
        Assert.assertEquals(message, Config.getProperty("message"));
    }
}
