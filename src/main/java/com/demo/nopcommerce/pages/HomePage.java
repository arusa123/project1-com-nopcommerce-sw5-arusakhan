package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    //Adding all the elements on homepage
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(id = "small-searchterms")
    WebElement searchStore;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartLink;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeTextMessage;

    public void clickOnLoginLink() {

        Reporter.log("Login link " + loginLink.toString());
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Login link " + loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Register link " + loginLink.toString());
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Register link " + registerLink);
    }

    public void enterTextInSearchStoreField(String searchProduct) {
        Reporter.log("Search store " + searchStore.toString());
        sendTextToElement(searchStore, searchProduct);
        CustomListeners.test.log(Status.PASS, "Search store " + searchStore);
    }

    public void hoverMouseOverShoppingCartLink() {
        Reporter.log("Shopping cart " + shoppingCartLink.toString());
        mouseHoverToElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Shopping cart " + shoppingCartLink);
    }

    public void clickOnGoToCartLink() {
        Reporter.log("Search store " + goToCartLink.toString());
        clickOnElement(goToCartLink);
        //CustomListeners.test.log(Status.PASS, "Cart link " + goToCartLink);
    }

    public String getWelcomeTextMessage() {
        Reporter.log("Welcome text " + welcomeTextMessage.toString());
        CustomListeners.test.log(Status.PASS, "Welcome text " + welcomeTextMessage);
        return welcomeTextMessage.getText();
    }

    public void clickOnLogOutLink() {
        Reporter.log("Logout link " + logoutLink.toString());
        clickOnElement(logoutLink);
        CustomListeners.test.log(Status.PASS, "Welcome text " + welcomeTextMessage);

    }

    public String currentUrl() {
        String url = driver.getCurrentUrl();
        Reporter.log("current url " + url.toString());
        CustomListeners.test.log(Status.PASS, "current url " + url);

        return url;
    }

}
