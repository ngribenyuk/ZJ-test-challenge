package com.check24de.cucumber.steps;

import cucumber.api.java.en.And;

public class UserMenuSteps extends BaseSteps {
    @And("expand \"My Account\" tab")
    public void expandMyAccountTab() {
        landingPage.expandCustomerMenu();
    }
}
