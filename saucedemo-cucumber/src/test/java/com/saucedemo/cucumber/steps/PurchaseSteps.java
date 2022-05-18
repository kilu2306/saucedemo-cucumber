package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PurchaseSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String name, String password)  {
        new HomePage().enterUserName(name);
        new HomePage().enterPassword(password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String name)  {
        new ProductPage().selectHighToLowFromFilter(name);

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() throws InterruptedException {
        new ProductPage().getCheapestAndCostlyPriceProduct();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().clickOnCartButton();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clickOnCheckOutButton();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String code)  {
        new CheckOutPage().enterFirstName(firstname);
        new CheckOutPage().enterLastName(lastname);
        new CheckOutPage().enterZipCode(code);

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinue();

    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutOverviewPage().clickOnFinishButton();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder()   {
        String expactedText="Thank you for your order";
        Assert.assertEquals("Displayed message is wrong",expactedText,new CheckOutCompletePage().getThankYouText());
    }
}
