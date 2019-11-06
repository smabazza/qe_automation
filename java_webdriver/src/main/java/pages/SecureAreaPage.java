/***
 * SecureAreaPage.java
 * Contains the attributes and operations in the Secure Area page.
 * Date: November 5, 2019
 * Author: Stephen Mabazza, Sr. Quality Analyst
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }

}
