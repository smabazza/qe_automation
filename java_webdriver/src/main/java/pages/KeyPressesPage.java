package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By keyPressTextfield = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void pressKey(String keys) {
        driver.findElement(keyPressTextfield).sendKeys(keys);
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}
