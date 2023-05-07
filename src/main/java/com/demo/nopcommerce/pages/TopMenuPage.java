package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenuPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']//ul/child::*")
    List<WebElement> topMenuBar;

    @CacheLookup
    @FindBy(css = "div.page-title")
    WebElement pageTitles;
    // By pageTitles = By.cssSelector("div.page-title");

    //This method will choose the options from main menu
    public void selectMenu(String menu) {
        CustomListeners.test.log(Status.PASS, "Hover over menu " + topMenuBar);
        Reporter.log("Hover over menu " + topMenuBar.toString());
        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(menu)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
    }

    public void hoverOverMenu(String mMenu) {
        CustomListeners.test.log(Status.PASS, "Hover over menu " + topMenuBar);
        Reporter.log("hover over menu " + topMenuBar.toString());
        Actions actions = new Actions(driver);
        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(mMenu)) {
                    actions.moveToElement(list).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
    }

    //This method will return title of each page for verification purpose
    public String textOnEachPage() {
        CustomListeners.test.log(Status.PASS, "Page title " + pageTitles);
        Reporter.log("Page title " + pageTitles.toString());
        return pageTitles.getText();
    }
}
