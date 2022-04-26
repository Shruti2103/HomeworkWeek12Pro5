package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openbrowser(String baseurl) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        // launch url
        driver.get(baseurl);
        //Maximise the application
        driver.manage().window().maximize();
        //give implicite time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // quit browser

    }


    public void closeBrowser() {
        driver.quit();
    }

}


