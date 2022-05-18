package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    public static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filerDropDownMenu;
    @CacheLookup
    @FindBy(xpath = "//div[@class=\"inventory_item_price\"]")
    List<WebElement> priceListOfProducst;
    @CacheLookup
    @FindBy(xpath = "//button[@class=\"btn btn_primary btn_small btn_inventory\"]")
    List<WebElement> addCartButtonList;
    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartButton;


    public void selectHighToLowFromFilter(String name) {
        selectByVisibleTextFromDropDown(filerDropDownMenu, name);
    }

    public void getCheapestAndCostlyPriceProduct() throws InterruptedException {

        addCartButtonList.get(0).click();
        addCartButtonList.get(addCartButtonList.size() - 1).click();
    }


    public void clickOnCartButton() {
        clickOnElement(cartButton);
    }

}


