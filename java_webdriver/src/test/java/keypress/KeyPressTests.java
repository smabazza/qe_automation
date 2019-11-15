package keypress;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import java.security.Key;

import static org.testng.Assert.*;

public class KeyPressTests extends BaseTest {

    @Test
    public void testBackSpace() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.pressKey("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResultText(), "You entered: BACK_SPACE");
    }

    @Test
    public void testTabKey() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.pressKey("A" + Keys.TAB);
        assertEquals(keyPressesPage.getResultText(), "You entered: TAB");
    }

    @Test
    public void testSlider(){

    }
}
