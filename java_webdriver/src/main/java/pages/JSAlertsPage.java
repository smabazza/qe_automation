package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {

    private WebDriver driver;
    //private By jsAlertButton = By.cssSelector("div.example > ul  > li:nth-child(1) button");
    private By jsAcceptAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By jsConfirmAlertButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By jsPromptAlertButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By alertMessage = By.id("result");

    public JSAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJSAcceptAlertButton(){
        driver.findElement(jsAcceptAlertButton).click();
    }

    public void clickJSConfirmButton(){
        driver.findElement(jsConfirmAlertButton).click();
    }

    public void clickJSPromptButton(){
        driver.findElement(jsPromptAlertButton).click();
    }

    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void DismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void SetAlertText(String alertText){
        driver.switchTo().alert().sendKeys(alertText);
    }

    public String GetAlertMessage(){
        return driver.findElement(alertMessage).getText();
    }
}
