package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkoutAsGuestButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerButton;

    public String getWelcomeText() {
        Reporter.log("Welcome text " + welcomeMessage.toString());
        CustomListeners.test.log(Status.PASS, "Welcome text " + welcomeMessage);
        return welcomeMessage.getText();
    }

    public void enterEmailId(String userEmail) {
        Reporter.log("email" + emailField.toString());
        sendTextToElement(emailField, userEmail);
        CustomListeners.test.log(Status.PASS, "Email" + emailField);
    }

    public void enterPassword(String userPassword) {
        Reporter.log("Password" + passwordField.toString());
        sendTextToElement(passwordField, userPassword);
        CustomListeners.test.log(Status.PASS, "Password" + passwordField);
    }

    public void clickOnLogInButton() {
        Reporter.log("Login button" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Login button" + loginButton);
    }

    public String getErrorMessage() {
        Reporter.log("Error message " + errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Error message " + errorMessage);
        return errorMessage.getText();
    }

    public void clickOnCheckoutAsGuestButton() {
        Reporter.log("Guest checkout " + checkoutAsGuestButton.toString());
        CustomListeners.test.log(Status.PASS, "Guest checkout " + checkoutAsGuestButton);
        clickOnElement(checkoutAsGuestButton);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Register button " + registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Register button " + registerButton);
    }
}
