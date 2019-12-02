package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTest {

    @Test
    public void testRetrievePassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordLink();
        forgotPasswordPage.inputEmailAddress("tau.user1@tau.com");
        ForgotPasswordPage.EmailSentPage emailSentPage = forgotPasswordPage.submitEmailAddress();
        assertEquals(emailSentPage.getPageContent(), "Your e-mail's been sent!" );
    }
}
