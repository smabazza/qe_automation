package frame;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import java.util.List;

import static org.testng.Assert.*;

public class FrameTests extends BaseTest {
    private String text1 = "the quick brown fox ";
    private String text2 = "jumps over the lazy dog.";
    private By bulletListButton = By.cssSelector("#mceu_9 button");
    private By numberListButton = By.cssSelector("#mceu_10 button");
    private By ULElement = By.tagName("ul");
    private By OLElement = By.tagName("ol");


    @Test
    public void testIncreaseIndentationButton(){

        WysiwygEditorPage textEditor = homePage.clickWysiwygEditorPageLink();
        textEditor.clearTextEditor();
        textEditor.setInputText(text1);
        textEditor.clickIncreaseIndentationButton();
        textEditor.setInputText(text2);
        assertEquals(textEditor.getInputText(), text1+text2, "Returned text is incorrect");

    }

    @Test
    public void testBulletListButton(){
        WysiwygEditorPage textEditor = homePage.clickWysiwygEditorPageLink();
        textEditor.clearTextEditor();
        textEditor.clickListButton(bulletListButton); // Comment this line to test that the page object methods are correct.
        textEditor.setInputText(text1);
        List<WebElement> listElements = textEditor.findListElement(ULElement);
        assertEquals(textEditor.countBulletItems(listElements), 1, "There is no bullet item in the editor");
    }

    @Test
    public void testNumberListButton(){
        WysiwygEditorPage textEditor = homePage.clickWysiwygEditorPageLink();
        textEditor.clearTextEditor();
        textEditor.clickListButton(numberListButton); // Comment this line to test that the page object methods are correct.
        textEditor.setInputText(text1);
        List<WebElement> listElements = textEditor.findListElement(OLElement);
        assertEquals(textEditor.countBulletItems(listElements), 1, "There is no numbered item in the editor");
    }
}
