package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;

    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement telephoneNoField;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButtonCheckout;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayDelivery;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement nextSecondDayDelivery;
    @CacheLookup
    @FindBy(xpath = "//button[@class ='button-1 shipping-method-next-step-button']")
    WebElement continueButtonDelivery;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPayment;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectCreditCardFiled;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardholderNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonthFiled;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYearFiled;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeFiled;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonCreditCard;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement paymentMethodText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethod;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]")
    WebElement totalFinalPrice;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderProcessedMessage;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonOnThankYouNote;

    public void sendTextToFirstNameField(String fName) {
        CustomListeners.test.log(Status.PASS, "Get the size of the pant " + firstNameField);
        Reporter.log("first name " + firstNameField.toString());
        sendTextToElement(firstNameField, fName);
    }

    public void sendTextToLastNameField(String lName) {
        CustomListeners.test.log(Status.PASS, "Last name " + lastNameField);
        Reporter.log("Last name " + lastNameField.toString());
        sendTextToElement(lastNameField, lName);
    }

    public void sendTextTOEmailField(String gEmail) {
        CustomListeners.test.log(Status.PASS, "Email field " + emailIdField);
        Reporter.log("Email field " + emailIdField.toString());
        sendTextToElement(emailIdField, gEmail + randomNumbers(1000) + "@gmail.com");
    }

    public void sendTextToCityField(String gCity) {
        sendTextToElement(cityField, gCity);
        CustomListeners.test.log(Status.PASS, "city name " + cityField);
        Reporter.log("city name " + cityField.toString());
    }

    public void selectACountryInCountryField(String gCountry) {
        CustomListeners.test.log(Status.PASS, "Country name " + countryField);
        Reporter.log("Country name " + countryField.toString());
        selectByVisibleTextFromDropDown(countryField, gCountry);
    }

    public void sendTextToAddressField(String gAddress) {
        sendTextToElement(addressField, gAddress);
        CustomListeners.test.log(Status.PASS, "city name " + cityField);
        Reporter.log("city name " + cityField.toString());
    }

    public void sendTextToPostCodeField(String gPostCode) {
        CustomListeners.test.log(Status.PASS, "Post code " + postCodeField);
        Reporter.log("Post Code " + postCodeField.toString());
        sendTextToElement(postCodeField, gPostCode);
    }


    public void sendTextToPhoneField(String gtele) {
        CustomListeners.test.log(Status.PASS, "Contact number " + telephoneNoField);
        Reporter.log("contact number " + cityField.toString());
        sendTextToElement(telephoneNoField, gtele);
    }

    public void clickOnContinueButtonCheckout() {
        CustomListeners.test.log(Status.PASS, "continue button " + continueButtonCheckout);
        Reporter.log("continue " + continueButtonCheckout.toString());
        clickOnElement(continueButtonCheckout);
    }

    public void clickOnNextDayAirDelivery() {
        CustomListeners.test.log(Status.PASS, "Next day delivery " + nextDayDelivery);
        Reporter.log("Next day delivery " + nextDayDelivery.toString());
        clickOnElement(nextDayDelivery);
    }

    public void clickOnSecondDayAirDelivery() {
        CustomListeners.test.log(Status.PASS, "Second delivery " + nextSecondDayDelivery);
        Reporter.log("Second day delivery " + nextSecondDayDelivery.toString());
        clickOnElement(nextSecondDayDelivery);
    }

    public void clickOnContinueButtonDelivery() {
        CustomListeners.test.log(Status.PASS, "continue button " + continueButtonDelivery);
        Reporter.log("continue button " + continueButtonDelivery.toString());
        clickOnElement(continueButtonDelivery);
    }

    public void clickOnCreditCardPaymentMethod() {
        CustomListeners.test.log(Status.PASS, "credit card payment method " + creditCardPaymentMethod);
        Reporter.log("credit card payment method " + creditCardPaymentMethod.toString());
        clickOnElement(creditCardPaymentMethod);
    }

    public void clickOnContinueButtonPayment() {
        CustomListeners.test.log(Status.PASS, "contiune button " + continueButtonPayment);
        Reporter.log("contiune button " + continueButtonPayment.toString());
        clickOnElement(continueButtonPayment);
    }

    public void selectCreditCard(int cCard) {

        CustomListeners.test.log(Status.PASS, "payment method " + selectCreditCardFiled);
        Reporter.log("payment method " + selectCreditCardFiled.toString());
        selectByIndexFromDropDown(selectCreditCardFiled, cCard);
    }

    public void sendTextToCardholderNameField(String cardholder) {
        Reporter.log("Card holder name " + cardholderNameField.toString());
        sendTextToElement(cardholderNameField, cardholder);
        CustomListeners.test.log(Status.PASS, "card holder name " + cardholderNameField);
    }

    public void sendTextToCardNumberField(String cardNumber) {
        Reporter.log("card number " + cardNumberFiled.toString());
        sendTextToElement(cardNumberFiled, cardNumber);
        CustomListeners.test.log(Status.PASS, "card number " + cardNumberFiled);
    }

    public void selectExpiryMonth(String month) {
        Reporter.log("Expiry month " + expiryMonthFiled.toString());
        selectByValueFromDropDown(expiryMonthFiled, month);
        CustomListeners.test.log(Status.PASS, "card expiry month " + expiryMonthFiled);
    }

    public void selectExpiryYear(String year) {
        Reporter.log("Expiry year " + expiryYearFiled.toString());
        selectByValueFromDropDown(expiryYearFiled, year);
        CustomListeners.test.log(Status.PASS, "card expiry year " + expiryYearFiled);
    }

    public void sendTextToCardCodeField(String cardCode) {
        Reporter.log("card code " + cardCodeFiled.toString());
        sendTextToElement(cardCodeFiled, cardCode);
        CustomListeners.test.log(Status.PASS, "card expiry month " + cardCodeFiled);
    }

    public void clickOnContinueButtonCreditCard() {
        Reporter.log("continue with payment " + continueButtonCreditCard.toString());
        clickOnElement(continueButtonCreditCard);
        CustomListeners.test.log(Status.PASS, "continue with payment " + continueButtonCreditCard);
    }

    public String getPaymentMethodText() {
        Reporter.log("continue with payment " + continueButtonCreditCard.toString());
        CustomListeners.test.log(Status.PASS, "card expiry month " + paymentMethodText);
        return paymentMethodText.getText();
    }

    public String getDeliveryMethodText() {
        Reporter.log("shipping method " + shippingMethod.toString());
        CustomListeners.test.log(Status.PASS, "Shipping method " + shippingMethod);
        return shippingMethod.getText();
    }

    public String getTotalPriceText() {
        Reporter.log("Total price text " + totalFinalPrice.toString());
        CustomListeners.test.log(Status.PASS, "Total price text " + totalFinalPrice);
        return totalFinalPrice.getText();
    }

    public void clickOnConfirmButton() {
        Reporter.log("confirm button " + confirmButton.toString());
        clickOnElement(confirmButton);
        CustomListeners.test.log(Status.PASS, "confirm button " + confirmButton);
    }

    public String getThankYouTextAfterOrderConfirmation() {
        Reporter.log("Thank you text " + thankYouText.toString());
        CustomListeners.test.log(Status.PASS, "Thank you text " + thankYouText);
        return thankYouText.getText();
    }

    public String getOrderProcessedSuccessfullyTextAfterOrderConfirmation() {
        Reporter.log("Order processed " + orderProcessedMessage.toString());
        CustomListeners.test.log(Status.PASS, "Order processed " + orderProcessedMessage);
        return orderProcessedMessage.getText();
    }

    public void clickOnContinueButtonOnThankYouNote() {
        Reporter.log("thank you " + continueButtonOnThankYouNote.toString());
        clickOnElement(continueButtonOnThankYouNote);
        CustomListeners.test.log(Status.PASS, "thank you  " + continueButtonOnThankYouNote);
    }

}
