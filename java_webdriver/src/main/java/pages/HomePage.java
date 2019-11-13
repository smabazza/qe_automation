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

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHoversLink(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditorPageLink(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
