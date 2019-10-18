package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import page.objects.*;
import sun.swing.SwingUtilities2;

import java.util.concurrent.TimeUnit;

public class BaseTest {

  //  protected Page page;
    WebDriver driver;


    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://przyklady.javastart.pl/jpetstore/");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
