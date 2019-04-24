package com.check24de.cucumber.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    private SelenideElement signInLink = $("#c24-customer-salutation a");
    private SelenideElement cumtomerMenu = $(".c24-customer-hover");
    private SelenideElement startHereLink = $(".c24-customer-salutation-text a");
    private ElementsCollection navigationHeader = $$(".c24-mainnav-sec>li");
    private ElementsCollection autoCompleteList = $$(".ui-autocomplete li");


    public boolean isSignInLinkDisplayed() {
        return signInLink.isDisplayed();
    }

    public LoginPage clickOnSignInLink(){
        signInLink.click();
        return page(LoginPage.class);
    }

    public void expandCustomerMenu() {
        cumtomerMenu.hover();
    }

    public RegistrationPage clickOnStartHereLink() {
        startHereLink.click();
        return page(RegistrationPage.class);
    }

    public void selectNavigationHeaderValue(String value) {
        navigationHeader.filterBy(text(value)).first().click();
    }

    public void selectFromAutocomplete(String value) {
        //autoCompleteList.filterBy(text(value)).first().click();
        autoCompleteList.find(text(value)).click();
    }

}
