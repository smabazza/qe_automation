/***
 * HomePage.java
 * Contains the attributes and operations in the home page.
 * Date: November 5, 2019
 * Author: Stephen Mabazza, Sr. Quality Analyst
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.Key;

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

    public FramesPage clickFramesLink() {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOM clickLargeAndDeepDOMLink(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOM(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
