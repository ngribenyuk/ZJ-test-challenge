package com.check24de.cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends RegistrationPage {
    private SelenideElement signInButton = $("#c24-kb-register-btn");

    public UserAccountPage clickOnSignInButton(){
        signInButton.click();
        return page(UserAccountPage.class);
    }

}
