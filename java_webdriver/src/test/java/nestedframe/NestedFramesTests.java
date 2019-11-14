package nestedframe;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

import static org.testng.Assert.*;

public class NestedFramesTests extends BaseTest {

    @Test
    public void testLeftFrame(){
        FramesPage framesPage = homePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
        nestedFramesPage.switchToTopFrame();
        nestedFramesPage.switchToLeftFrame();
        String bodyText = nestedFramesPage.getFrameBodyText();
        assertEquals(bodyText, "LEFT");
    }

    @Test
    public void testMiddleFrame(){
        FramesPage framesPage = homePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
        nestedFramesPage.switchToTopFrame();
        nestedFramesPage.switchToMiddleFrame();
        String bodyText = nestedFramesPage.getFrameBodyText();
        assertEquals(bodyText, "MIDDLE");
    }

    @Test
    public void testRightFrame(){
        FramesPage framesPage = homePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
        nestedFramesPage.switchToTopFrame();
        nestedFramesPage.switchToRightFrame();
        String bodyText = nestedFramesPage.getFrameBodyText();
        assertEquals(bodyText, "RIGHT");
    }

    @Test
    public void testBottomFrame(){
        FramesPage framesPage = homePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
        nestedFramesPage.switchToBottomFrame();
        String bodyText = nestedFramesPage.getFrameBodyText();
        assertEquals(bodyText, "BOTTOM");
    }
}
