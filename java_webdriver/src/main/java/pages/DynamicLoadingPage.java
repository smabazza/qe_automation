package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXPath = ".//a[contains(text(), '%s')]";
    private By dynamicPageLink1 = By.xpath(String.format(linkXPath, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1Link(){
        driver.findElement(dynamicPageLink1).click();
        return new DynamicLoadingExample1Page(driver);
    }



}
