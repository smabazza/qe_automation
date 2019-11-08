package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By imageBox = By.className("figure");
    private By imageCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public FigureCaption hoverOverImage(int index){
        WebElement image = driver.findElements(imageBox).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(image).perform();

        return new FigureCaption(image.findElement(imageCaption));
    }

    /**
     * This inner class was created to model the selected (or hovered) image. It could also be created outside of this
     * class but since the HoversPage class is small, so it would not hurt to add this inner class here
     */
    public class FigureCaption {

        private WebElement imageCaption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement imageCaption) {
            this.imageCaption = imageCaption;
        }

        public boolean isCaptionDisplayed(){
            return imageCaption.isDisplayed();
        }

        public String getImageCaptionText() {
            return imageCaption.findElement(header).getText();
        }

        public String getImageCaptionLink() {
            return imageCaption.findElement(link).getAttribute("href");
        }

        public String getImageCaptionLinkText(){
            return imageCaption.findElement(link).getText();
        }
    }
}
