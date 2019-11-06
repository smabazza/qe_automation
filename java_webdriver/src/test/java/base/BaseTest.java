/***
 * BaseTest.java
 * Contains test setup and tear down operations.
 * Date: November 5, 2019
 * Author: Stephen Mabazza, Sr. Quality Analyst
 */

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;   // protected so that test classes that inherit from this class will have access to homePage

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "./resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Firefox driver
        // System.setProperty("webdriver.gecko.driver", "./resources/webdrivers/geckodriver.exe");
        // driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

