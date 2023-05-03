package com.sauce.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(css = "#checkout")
    public WebElement checkout;

    @FindBy(css = "#first-name")
    public WebElement firstNameInput;

    @FindBy(css = "#last-name")
    public WebElement lastNameInput;

    @FindBy(css = "#postal-code")
    public WebElement postCodeInput;

    @FindBy(css = "#continue")
    public WebElement continueBtn;

    public void entersDetails(String firstname,String lastname,String postcode){
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        postCodeInput.sendKeys(postcode);
    }

    @FindBy(css= ".summary_info_label.summary_total_label")
    public WebElement totalPrice;

    @FindBy(css="#finish")
    public WebElement finishBtn;

    @FindBy(xpath = "//h2[contains(text(),'Thank you for your order!')]")
    public WebElement confirmationMessage;

}
