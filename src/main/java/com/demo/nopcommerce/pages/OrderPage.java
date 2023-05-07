package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OrderPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']/h1")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement selectHDD400GB;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement selectVistaPremium;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement selectTotalCommander;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']")
    WebElement price;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement messageAfterAddingToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeButtonOnMessage;


    public String getProductName() {
        Reporter.log("Product name " + productName.toString());
        CustomListeners.test.log(Status.PASS, "Product name " + productName);
        return getTextFromElement(productName);
    }

    public void selectAProcessor(String process) {
        Reporter.log("select Processor " + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectProcessor, process);
        CustomListeners.test.log(Status.PASS, "select Processor " + selectProcessor);
    }

    public void SelectARam(String ram) {
        Reporter.log("select ram " + selectRam.toString());
        selectByVisibleTextFromDropDown(selectRam, ram);
        CustomListeners.test.log(Status.PASS, "select ram " + selectRam);
    }

    public void clickAndSelectHDD() {
        Reporter.log("select HDD " + selectHDD400GB.toString());
        clickOnElement(selectHDD400GB);
        CustomListeners.test.log(Status.PASS, "select HDD " + selectHDD400GB);
    }

    public void clickAndSelectOsPremium() {
        Reporter.log("select vista premium " + selectVistaPremium.toString());
        clickOnElement(selectVistaPremium);
        CustomListeners.test.log(Status.PASS, "select vista premium " + selectVistaPremium);
    }

    public void clickAndSelectTotalCommander() {
        Reporter.log("select total commander " + selectTotalCommander.toString());
        clickOnElement(selectTotalCommander);
        CustomListeners.test.log(Status.PASS, "select total commander " + selectTotalCommander);
    }

    public String getPrice() {
        Reporter.log("get price " + price.toString());
        CustomListeners.test.log(Status.PASS, "get price " + price);
        return getTextFromElement(price);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("add To Cart Button " + addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Add to cart button " + addToCartButton);
    }

    public String getMessageAfterAddingToCart() {
        Reporter.log("Message After Adding To Cart " + messageAfterAddingToCart.toString());
        CustomListeners.test.log(Status.PASS, "Message After Adding To Cart " + messageAfterAddingToCart);
        return getTextFromElement(messageAfterAddingToCart);
    }

    public void clickOnCloseButtonOnMessage() {
        Reporter.log("Close Button On Message " + closeButtonOnMessage.toString());
        clickOnElement(closeButtonOnMessage);
        CustomListeners.test.log(Status.PASS, "Close Button On Message " + closeButtonOnMessage);
    }

    public void sentTextToQuantityField(String qty) {
        Reporter.log("Send text to quantity " + quantityField.toString());
        quantityField.clear();
        sendTextToElement(quantityField, qty);
        CustomListeners.test.log(Status.PASS, "Send text to quantity " + quantityField);
    }

}
