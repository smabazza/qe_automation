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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.WindowManager;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;   // protected so that test classes that inherit from this class will have access to homePage
    private String url = "https://the-internet.herokuapp.com";;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "./resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Firefox driver
        // System.setProperty("webdriver.gecko.driver", "./resources/webdrivers/geckodriver.exe");
        // driver = new FirefoxDriver();

        driver.get(url);
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void goToHomePage(){
        getWindowManager().goHome(url);
        getWindowManager().refreshPage();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}

