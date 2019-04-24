package com.check24de.cucumber.steps;

import com.check24de.cucumber.pages.LandingPage;
import com.check24de.cucumber.pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.Cookie;

import static com.check24de.cucumber.utils.Constants.LOGOUT_URL;
import static com.check24de.cucumber.utils.Constants.REGISTER_PAGE_URL;
import static com.codeborne.selenide.Selenide.open;


public class NavigationSteps extends BaseSteps {

    @Given("open landing page")
    public void openLandingPage() {
        landingPage = open(Configuration.baseUrl, LandingPage.class);
    }

    @Given("open registration page")
    public void openRegistrationPage() {
        open(REGISTER_PAGE_URL);
        Cookie cookie = new Cookie("c24cb", "1");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        registrationPage = open(REGISTER_PAGE_URL, RegistrationPage.class);
    }

    @Given("user is logged out")
    public void logOut() {
        open(LOGOUT_URL);
    }

    @When("select \"(.*)\" in navigation header")
    public void selectNavigationHeaderValue(String value) {
        landingPage.selectNavigationHeaderValue(value);
    }
}
