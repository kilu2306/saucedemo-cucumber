package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    public static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    public CheckOutPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
        log.info("Entring first name : "+ firstName.toString());
    }
    public  void enterLastName(String lName ){
        sendTextToElement(lastName,lName);
        log.info("Enter last name :" + lastName.toString());
    }
    public  void enterZipCode(String code){
        sendTextToElement(zipCode,code);
        log.info("Entring zip code : "+ zipCode.toString());
    }
   public  void clickOnContinue(){
        clickOnElement(continueButton);
        log.info("click on Continue :"+ continueButton);
   }
}
