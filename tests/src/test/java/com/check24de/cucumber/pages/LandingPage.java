package com.check24de.cucumber.pages;

import com.check24de.cucumber.models.User;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage extends BasePage {

    private SelenideElement loginButton = $("#login");

    public void loginAs(User user) {
        loginButton.click();
    }
}
