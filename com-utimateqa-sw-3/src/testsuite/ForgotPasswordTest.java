package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;


public class ForgotPasswordTest extends Utility {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openbrowser(baseurl);
    }

    @After
    public void testdown() {
        closeBrowser();
    }

    @Test
    public void navigateToForgotPasswordPageSuccessfully() {

        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        String expectedresult = "Forgot Your Password?";

        String actualresult1 = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        //Accert actual and expected
        Assert.assertEquals("Forfot your passsword", expectedresult, actualresult1);


    }

}
