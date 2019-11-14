package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInputField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");


    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputEmailAddress(String email) {
        driver.findElement(emailInputField).sendKeys(email);
    }

    public EmailSentPage submitEmailAddress() {
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage();
    }

    /*** This is a small class to model the email sent page

     ***/
    public class EmailSentPage {

        private By emailSentPageContent = By.id("content");

        public String getPageContent() {
            String contentText =  driver.findElement(emailSentPageContent).getText();
            //System.out.println(contentText);
            return contentText;
        }
    }

}

