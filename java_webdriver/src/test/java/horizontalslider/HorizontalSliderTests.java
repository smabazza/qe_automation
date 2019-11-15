package horizontalslider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTest {

    @Test
    public void testSlider(){
        HorizontalSliderPage sliderPage = homePage.clickHorizontalSliderLink();
        sliderPage.pressKey("4");
        assertEquals(sliderPage.getSliderText(), "4");
    }

    @Test
    public void testNegativeSliderValue(){
        HorizontalSliderPage sliderPage = homePage.clickHorizontalSliderLink();
        sliderPage.pressKey("-4");
        assertEquals(sliderPage.getInvalidSliderText(), "Invalid slider value entered...");
    }
}
