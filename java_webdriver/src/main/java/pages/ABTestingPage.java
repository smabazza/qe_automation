package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTestingPage {

    private WebDriver driver;
    private By abLabel = By.cssSelector("div.example h3");

    public ABTestingPage(WebDriver driver){
        this.driver = driver;
    }

    public String GetPageTitle() {
        return driver.findElement(abLabel).getText();
    }

}
