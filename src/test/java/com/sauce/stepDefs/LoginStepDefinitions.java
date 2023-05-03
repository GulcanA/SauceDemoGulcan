package com.sauce.stepDefs;

import com.sauce.pages.CheckoutPage;
import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class LoginStepDefinitions {
    ProductPage productPage=new ProductPage();
    LoginPage loginPage=new LoginPage();

    CheckoutPage checkoutPage = new CheckoutPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));


    }
    @When("the user enters {string} username and {string}")
    public void the_user_enters_username_and(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("The user should be able to login and able to see {string} header")
    public void the_user_should_be_able_to_login_and_able_to_see_header(String expectedHeader) {

        Assert.assertEquals(expectedHeader,productPage.productHeader.getText());

    }

     @And("The user able to sort the products {string}")
    public void theUserAbleToSortTheProducts(String sortType) {
        productPage.sortProducts(sortType);

    }
    @And("The user opens basket")
    public void theUserOpensBasket() {

        productPage.basket.click();
    }
    @And("The user clicks checkout")
    public void theUserClicksCheckout() {

        checkoutPage.checkout.click();
    }

    @And("The user enters details {string} {string} {string} and finish the purchase")
    public void theUserEntersDetailsAndFinishThePurchase(String firstName, String lastName, String postcode) {

        checkoutPage.entersDetails(firstName, lastName, postcode);
        checkoutPage.continueBtn.click();

    }

    @And("The user clicks cheapest as {string} and clicks second as {string} products")
    public void theUserClicksCheapestAsAndClicksSecondAsProducts(String cheapest, String second) {
        productPage.addProduct(cheapest);
        productPage.addProduct(second);
    }

    @Then("The user verify that {string}")
    public void theUserVerifyThat(String expectedPrice) {
        System.out.println(checkoutPage.totalPrice.getText());
        Assert.assertEquals(expectedPrice,checkoutPage.totalPrice.getText());
    }

    @And("The user clicks finish button")
    public void theUserClicksFinishButton() {
        checkoutPage.finishBtn.click();
    }

    @Then("The user able to see  confirmation message as {string}")
    public void theUserAbleToSeeConfirmationMessageAs(String expectedMessage) {
        Assert.assertEquals(expectedMessage,checkoutPage.confirmationMessage.getText());
    }

}
