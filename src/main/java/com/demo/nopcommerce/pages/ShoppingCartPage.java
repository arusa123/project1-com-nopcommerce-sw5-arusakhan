package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement quantityField;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary'][1]/strong")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termAndConditions;

    @CacheLookup
    @FindBy(name = "checkout")
    WebElement checkoutButton;


    public String getShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "shopping cart text " + shoppingCartText);
        Reporter.log("Shopping cart text  " + shoppingCartText.toString());
        return shoppingCartText.getText();
    }

    public void sendTextToQuantityField(String qty) {
        quantityField.clear();
       // clearTextFromElement(quantityField);
        sendTextToElement(quantityField, qty);
    }

    public void clickOnUpdateCartButton() {
        Reporter.log("Update cart " + updateCartButton.toString());
        clickOnElement(updateCartButton);
        CustomListeners.test.log(Status.PASS, "Update cart " + updateCartButton);
    }

    public String getTotalPrice() {
        CustomListeners.test.log(Status.PASS, "Total price " + totalPrice);
        Reporter.log("Total price  " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermAndConditions() {
        Reporter.log("Terms and condition " + termAndConditions.toString());
        clickOnElement(termAndConditions);
        CustomListeners.test.log(Status.PASS, "Terms and condition " + termAndConditions);
    }

    public void clickOnCheckoutButton() {
        Reporter.log("Checkout button" + checkoutButton.toString());
        clickOnElement(checkoutButton);
        CustomListeners.test.log(Status.PASS, "Check button " + checkoutButton);
    }

    public String getQuantityInQtyField() {
        WebElement actualQuantity = quantityField;
        String actual = actualQuantity.getAttribute("value");
        Reporter.log("Quantity " + quantityField.toString());
        CustomListeners.test.log(Status.PASS, "Quantity " + quantityField);
        return actual;
    }
}
