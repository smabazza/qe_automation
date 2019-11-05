package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        System.out.println(driver.getTitle());
        driver.quit();

    }
    public static void main(String args[]) {
        BaseTest tests = new BaseTest();
        tests.setUp();
    }

}

