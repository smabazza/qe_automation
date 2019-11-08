package hovers;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoversTests extends BaseTest {

    @Test
    public void testHoverImageOne(){
        // Arrange
        HoversPage hoversPage = homePage.clickHoversLink();

        // Act
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverImage(1);

        // Asserts
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not displayed.");
        assertEquals(figureCaption.getImageCaptionText(), "name: user1", "Image caption text is incorrect.");
        assertEquals(figureCaption.getImageCaptionLinkText(), "View profile", "Caption link text is incorrect.");
        assertTrue(figureCaption.getImageCaptionLink().endsWith("/users/1"), "Link is incorrect.");
    }

    @Test
    public void testHoverImageTwo(){
        // Arrange
        HoversPage hoversPage = homePage.clickHoversLink();

        // Act
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverImage(2);

        // Asserts
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not displayed.");
        assertEquals(figureCaption.getImageCaptionText(), "name: user2", "Image caption text is incorrect.");
        assertEquals(figureCaption.getImageCaptionLinkText(), "View profile", "Caption link text is incorrect.");
        assertTrue(figureCaption.getImageCaptionLink().endsWith("/users/2"), "Link is incorrect.");
    }

    @Test
    public void testHoverImageThree(){
        // Arrange
        HoversPage hoversPage = homePage.clickHoversLink();

        // Act
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverImage(3);

        // Asserts
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not displayed.");
        assertEquals(figureCaption.getImageCaptionText(), "name: user3", "Image caption text is incorrect.");
        assertEquals(figureCaption.getImageCaptionLinkText(), "View profile", "Caption link text is incorrect.");
        assertTrue(figureCaption.getImageCaptionLink().endsWith("/users/3"), "Link is incorrect.");
    }
}
