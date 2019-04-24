package com.check24de.cucumber.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UserAccountPage extends BasePage {
    private SelenideElement welcomeBonusClose = $("#c24-dialog-points-modal .button-cancel");
    private SelenideElement helloMessagePlaceholder = $(".grid--top");

    public void closeWelcomeBonusScreen() {
        welcomeBonusClose.shouldBe(Condition.visible);
        welcomeBonusClose.click();
    }

    public String getHelloMessage() {
        return helloMessagePlaceholder.getText();
    }
}
