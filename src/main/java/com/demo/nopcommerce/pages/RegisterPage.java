package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[1]")
    WebElement maleGenderButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[2]")
    WebElement femaleGenderButton;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationSuccessfulText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonAfterRegistrationComplete;


    public String getRegisterPageText() {
        Reporter.log("Register text " + registerText.toString());
        CustomListeners.test.log(Status.PASS, "Register text " + registerText);
        return getTextFromElement(registerText);
    }

    public void selectGenderOnRegistrationPage(String gender) {

        if (gender.equalsIgnoreCase("Male")) {
            clickOnElement(maleGenderButton);
        } else if (gender.equalsIgnoreCase("Female")) {
            clickOnElement(femaleGenderButton);
        }

    }

    public void sendTextToFirstNameField(String fName) {
        Reporter.log("First name " + firstNameField.toString());
        sendTextToElement(firstNameField, fName);
        CustomListeners.test.log(Status.PASS, "first name " + firstNameField);
    }

    public void sendTextToLastNameField(String lName) {
        Reporter.log("last name " + lastNameField.toString());
        sendTextToElement(lastNameField, lName);
        CustomListeners.test.log(Status.PASS, "last name " + lastNameField);
    }

    public void selectDayOfBirth(String day) {
        Reporter.log("First name " + dateOfBirthDay.toString());
        selectByValueFromDropDown(dateOfBirthDay, day);
        CustomListeners.test.log(Status.PASS, "Date of birthday " + dateOfBirthDay);
    }

    public void selectDayOfMonth(String month) {
        Reporter.log("Month of birth " + dateOfBirthMonth.toString());
        selectByValueFromDropDown(dateOfBirthMonth, month);
        CustomListeners.test.log(Status.PASS, "Month of birth " + dateOfBirthMonth);
    }

    public void selectDayOfYear(String year) {
        Reporter.log("Year of birth " + dateOfBirthYear.toString());
        selectByValueFromDropDown(dateOfBirthYear, year);
        CustomListeners.test.log(Status.PASS, "Year of birth " + dateOfBirthYear);
    }

    public void sendTextToEmailField(String email) {
        Reporter.log("Email " + emailId.toString());
        sendTextToElement(emailId, email + randomNumbers(1000) + "@gmail.com");
        CustomListeners.test.log(Status.PASS, "Email " + emailId);
    }

    public void sendTextToPasswordField(String rPassword) {
        Reporter.log("password " + password.toString());
        sendTextToElement(password, rPassword);
        CustomListeners.test.log(Status.PASS, "Password " + password);
    }

    public void sendTextToConfirmPasswordField(String cPassword) {
        Reporter.log("confirm password " + confirmPassword.toString());
        sendTextToElement(confirmPassword, cPassword);
        CustomListeners.test.log(Status.PASS, "confirm password " + confirmPassword);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Register button " + registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Register button " + registerButton);
    }

    public String getRegistrationSuccessfulText() {
        Reporter.log("Registration successful " + registrationSuccessfulText.toString());
        CustomListeners.test.log(Status.PASS, "Registration successful " + registrationSuccessfulText);
        return getTextFromElement(registrationSuccessfulText);
    }

    public void clickOnContinueButtonAfterRegistrationComplete() {
        Reporter.log(" continue aftetr Registration " + continueButtonAfterRegistrationComplete.toString());
        clickOnElement(continueButtonAfterRegistrationComplete);
        CustomListeners.test.log(Status.PASS, "continue after Registration  " + continueButtonAfterRegistrationComplete);
    }
}
