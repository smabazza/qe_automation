package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorPageArea = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentationButton = By.cssSelector("#mceu_12 button");
//    private By ULElement = By.tagName("ul");
//    private By OLElement = By.tagName("ol");
    private By listElement = By.tagName("li");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextEditor(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setInputText(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getInputText(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void clickIncreaseIndentationButton(){
        driver.findElement(increaseIndentationButton).click();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorPageArea);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clickListButton(By listButton) {
        driver.findElement(listButton).click();
    }

    public List<WebElement> findListElement(By element){
        switchToEditArea();
        List<WebElement> listElements = (List<WebElement>) driver.findElement(element).findElements(listElement);
        switchToMainArea();;
        return listElements;
    }

    public int countListItems(List<WebElement> list) {
        return list.size();
    }

}
