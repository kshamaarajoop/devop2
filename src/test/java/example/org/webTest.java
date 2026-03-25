package example.org;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class webTest {
    private static WebDriver driver;
    @BeforeTest
    public static void openBrowser() throws InterruptedException{
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("");

    }
    @Test
    public static void titleValidationTest(){
        String actualTitle=driver.getTitle();
        String expectedTitle="sumn title";
        Assert.assertEquals(actualTitle,expectedTitle);
        assertTrue(true,"title should contain");
    }
    @AfterTest
    public static void closeBrowser(){
        Thread.sleep(50000);
        driver.quit();
    }
}
