package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    private WebDriver driver;
    private By bodyTag = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToTopFrame(){
        switchToFrame("frame-top");
    }

    public void switchToBottomFrame(){
        switchToFrame("frame-bottom");
    }

    public void switchToLeftFrame(){
        switchToFrame("frame-left");
    }

    public void switchToRightFrame(){
        switchToFrame("frame-right");
    }

    public void switchToMiddleFrame(){
        switchToFrame("frame-middle");
    }

    public void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }

    public String getFrameBodyText(){
        //switchToFrame(frame);
        WebElement bodyElement = driver.findElement(bodyTag);
        return bodyElement.getText();
    }

    private void switchToFrame(String frame){
        driver.switchTo().frame(frame);
    }
}
