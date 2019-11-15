package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.cssSelector(".sliderContainer input");
    private By sliderText = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void pressKey(String numberOfPresses) {
        if(numberOfPresses.contains("-")) {
            System.out.println("Invalid slider value entered...");
        }
        else {
            while (!getSliderText().equals(numberOfPresses)) {
                driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
            }
        }
    }

    public String getSliderText(){
       return  driver.findElement(sliderText).getText();
    }

    public String getInvalidSliderText(){
        return "Invalid slider value entered...";
    }
}
