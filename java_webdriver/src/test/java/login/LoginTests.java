package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        // Arrange
        LoginPage loginPage = homePage.clickFormAuthentication();

        //Act
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        //Assert
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect");

    }

    @Test
    //@Description("Verify that logging in with incorrect password returns a 'Your username is invalid!' alert text")
    public void testLoginWithIncorrectUsername(){
        // Arrange
        LoginPage loginPage = homePage.clickFormAuthentication();

        //Act
        loginPage.setUsername("incorrectusername");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        //Assert
        assertTrue(secureAreaPage.getAlertText().contains("Your username is invalid!"), "Alert text is incorrect");

    }

    @Test
    //@Description("Verify that logging in with incorrect password returns a 'Your password is invalid!' alert text")
    public void testLoginWithIncorrectPassword(){
        // Arrange
        LoginPage loginPage = homePage.clickFormAuthentication();

        //Act
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!!!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        //Assert
        assertTrue(secureAreaPage.getAlertText().contains("Your password is invalid!"), "Alert text is incorrect");

    }

    @Test
    //@Description("Verify that logging in with empty username and password returns an 'Your username is invalid!' alert text")
    public void testLoginWithEmptyCredentials(){
        // Arrange
        LoginPage loginPage = homePage.clickFormAuthentication();

        //Act
        loginPage.setUsername(" ");
        loginPage.setPassword(" ");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        //Assert
        assertTrue(secureAreaPage.getAlertText().contains("Your username is invalid!"), "Alert text is incorrect");

    }
}
