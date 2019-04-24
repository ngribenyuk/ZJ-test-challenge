package com.check24de.cucumber.steps;

import com.check24de.cucumber.pages.*;

public class BaseSteps {
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    UserAccountPage userAccountPage = new UserAccountPage();
    TravelSearchPage travelSearchPage = new TravelSearchPage();
    TravelSearchResultsPage travelSearchResultsPage = new TravelSearchResultsPage();

}
