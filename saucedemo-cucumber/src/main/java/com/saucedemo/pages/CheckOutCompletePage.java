package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage extends Utility {
    public static final Logger log = LogManager.getLogger(CheckOutCompletePage.class.getName());
    public CheckOutCompletePage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement thankyouTextField;

    public String getThankYouText() {

        log.info("Getting thank you text :"+ thankyouTextField.toString());
        return thankyouTextField.getText();

    }
}
