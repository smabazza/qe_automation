/***
 * HomePage.java
 * Contains the attributes and operations in the home page.
 * Date: November 5, 2019
 * Author: Stephen Mabazza, Sr. Quality Analyst
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By basicAuthenticationLink = By.linkText("Basic Auth");
    private By digestAuthenticationLink = By.linkText("Digest Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public LoginPage clickBasicAuthenticationLink() {
        driver.findElement(basicAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public LoginPage clickDigestAuthenticationLink() {
        driver.findElement(digestAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
