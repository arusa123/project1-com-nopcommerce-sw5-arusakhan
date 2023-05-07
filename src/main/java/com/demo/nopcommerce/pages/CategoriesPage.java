package com.demo.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.demo.nopcommerce.customelisteners.CustomListeners;
import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class CategoriesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/child::*")
    List<WebElement> categoriesList;

    public void selectCategory(String cat) {
        CustomListeners.test.log(Status.PASS, "List category " + categoriesList);
        Reporter.log("List category" + categoriesList.toString());
        List<WebElement> catList = categoriesList;
        try {
            for (WebElement list : catList) {
                if (list.getText().equalsIgnoreCase(cat)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            catList = categoriesList;
        }
    }
}
