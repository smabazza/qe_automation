package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

import static org.testng.Assert.assertEquals;

public class JSAlertsTests extends BaseTest {

    @Test
    public void TestAcceptJSAlert(){
        JSAlertsPage jsAlertsPage = homePage.clickJSAlertsLink();

        jsAlertsPage.clickJSAcceptAlertButton();
        jsAlertsPage.AcceptAlert();

        assertEquals(jsAlertsPage.GetAlertMessage(), "You successfuly clicked an alert");

    }

    @Test
    public void TestDismissAlert(){
        JSAlertsPage jsAlertsPage = homePage.clickJSAlertsLink();

        jsAlertsPage.clickJSConfirmButton();
        jsAlertsPage.DismissAlert();

        assertEquals(jsAlertsPage.GetAlertMessage(), "You clicked: Cancel");

    }

    @Test
    public void TestPromptAlert(){
        JSAlertsPage jsAlertsPage = homePage.clickJSAlertsLink();

        jsAlertsPage.clickJSPromptButton();
        jsAlertsPage.SetAlertText("This is a test!");
        jsAlertsPage.AcceptAlert();

        assertEquals(jsAlertsPage.GetAlertMessage(), "You entered: This is a test!");

    }
}
