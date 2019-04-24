package com.check24de.cucumber.steps;

import com.check24de.cucumber.models.User;
import com.check24de.cucumber.utils.World;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.check24de.cucumber.utils.Constants.REGISTER_PAGE_URL;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationSteps extends BaseSteps {

    World world;

    public RegistrationSteps(World world){
        this.world=world;
    }
    @Given("prepare test user")
    public void prepareTestUser(){
        world.user=new User();
    }
    @And("no one is signed into the system")
    public void noOneSignedIntoTheSystem() {
        assertThat("User already signed in", landingPage.isSignInLinkDisplayed());
    }

    @Then("click \"Start Here\" link")
    public void newUserStartHereIsVisible() {
        registrationPage = landingPage.clickOnStartHereLink();
    }

    @Then("registration page is opened")
    public void registrationPageIsOpened() {
        assertThat(WebDriverRunner.url(), containsString(REGISTER_PAGE_URL));
    }

    @When("fill an email address")
    public void fillEmail() {
        registrationPage.fillEmailAddress(world.user.getEmail());
    }

    @When("fill custom (.*) address")
    public void fillCustomEmail(String email) {
        registrationPage.fillEmailAddress(email);
    }

    @Then("validation error (.*) is visible")
    public void verifyErrorMessage(String message) {
        assertThat(registrationPage.getValidationMessage(), equalTo(message));
    }

    @When("fill password and repeat password")
    public void fillPasswordAndConfirmPassword() {
        registrationPage.fillPassword(world.user.getPassword());
        registrationPage.fillConfirmPassword(world.user.getPassword());
    }

    @When("fill password")
    public void fillPassword() {
        registrationPage.fillPassword(world.user.getPassword());
    }

    @When("fill custom (.*) and (.*) password")
    public void fillPassword(String password, String confirmPassword) {
        registrationPage.fillPassword(password);
        registrationPage.fillConfirmPassword(confirmPassword);
    }

    @When("click on Register button")
    public void clickRegisterButton() {
        userAccountPage = registrationPage.clickRegisterButton();
    }

    @And("close welcome bonus screen")
    public void closeWelcomeBonusScreen() {
        userAccountPage.closeWelcomeBonusScreen();
    }

    @Then("user account page is opened and hello message is visible")
    public void verifySuccessFullRegistration() {
        assertThat("User is not on account page", userAccountPage.getHelloMessage(),
                equalTo("Hallo\n" +
                        "Sie sind angemeldet als " + world.user.getEmail()));
    }


}

