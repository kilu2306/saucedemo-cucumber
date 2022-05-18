package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPage extends Utility {
    public static final Logger log = LogManager.getLogger(CheckOutOverviewPage.class.getName());
    public CheckOutOverviewPage() {
        PageFactory.initElements(driver,this);

    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    public  void clickOnFinishButton(){
        clickOnElement(finishButton);
    }
}
