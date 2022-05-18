package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
public static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passWordFeild;
    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;





    public void enterUserName(String name){
        sendTextToElement(userNameField,name);
        log.info("Entering text to username :"+ name +userNameField.toString());
    }

    public void enterPassword(String passnum){
        sendTextToElement(passWordFeild,passnum);
        log.info("Entering password to passwordfield : "+ passnum +passWordFeild.toString());
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("clicking on log in button :"+ loginButton.toString());
    }

}
