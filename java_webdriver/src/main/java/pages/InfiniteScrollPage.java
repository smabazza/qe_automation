package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textParagraphs = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToParagrah(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        while(getNumberOfExistingParagraphs() < index){
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfExistingParagraphs(){
        return driver.findElements(textParagraphs).size();
    }

}
