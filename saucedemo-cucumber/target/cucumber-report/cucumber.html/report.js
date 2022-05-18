$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2958842500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 99966500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "PurchaseSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 166775400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 106711900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "PurchaseSteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 170918000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 131839300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 121710100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 51551900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "PurchaseSteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 242214200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 59833700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 48669800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 3043261000,
  "error_message": "org.junit.ComparisonFailure: Displayed message is wrong expected:\u003cT[hank you for your order]\u003e but was:\u003cT[HANK YOU FOR YOUR ORDER]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.saucedemo.cucumber.steps.PurchaseSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder(PurchaseSteps.java:70)\r\n\tat ✽.Then I should be able to see message \u0027Thank you for your order\u0027(purchase.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 893398500,
  "status": "passed"
});
});