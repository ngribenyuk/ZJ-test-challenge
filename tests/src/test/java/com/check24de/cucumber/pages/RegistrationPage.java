package com.check24de.cucumber.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationPage extends BasePage {


    private SelenideElement emailInput = $(By.id("email"));
    private SelenideElement passwordInput = $(By.id("password"));
    private SelenideElement confirmPasswordInput = $(By.id("passwordrepetition"));
    private SelenideElement registerButton = $(By.name("register"));
    private SelenideElement validationMessage = $(".error-desc");

    public String getValidationMessage() {
        return validationMessage.getText();
    }

    public void fillEmailAddress(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void fillPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void fillConfirmPassword(String password) {
        confirmPasswordInput.sendKeys(password);
    }

    public UserAccountPage clickRegisterButton() {
        registerButton.click();
        return page(UserAccountPage.class);
    }


}
