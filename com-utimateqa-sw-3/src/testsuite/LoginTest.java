package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;


public class LoginTest extends Utility {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    // set up browser
    @Before
    public void setup() {
        openbrowser(baseurl);
    }

    @Test
    public void loginSuccessfullyWithValidCredentials() {
        // enter username

        sendTextToElement(By.name("txtUsername"), "Admin");
        // enter password

        sendTextToElement(By.id("txtPassword"), "admin123");
        // login button

        clickOnElement(By.xpath("//input[@id='btnLogin']"));
        // varify assert welcometext
        String expectedmessage = "Welcome";

        String actualmessage2 = getTextFromElement(By.xpath("//a[@id='welcome']"));
        String actualmessage3 = actualmessage2.substring(0, 7);
        //now assert
        Assert.assertEquals("welcome page open", expectedmessage, actualmessage3);
    }

    @Test
    public void navigateToForgotPasswordPageSuccessfully() {
        // click on forgot password

        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));

        String expected = "Forgot Your Password?";

        String actualmessage = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        // now asscerting actual and expected
        Assert.assertEquals("Forgot your password", expected, actualmessage);

    }

    @After
    public void testdown() {
        closeBrowser();
    }


}
