package com.check24de.cucumber.steps;

import com.check24de.cucumber.models.User;
import com.check24de.cucumber.utils.World;
import cucumber.api.java.en.When;

import static com.check24de.cucumber.utils.Constants.CREATED_USER_EMAIL;
import static com.check24de.cucumber.utils.Constants.CREATED_USER_PASSWORD;

public class LoginSteps extends BaseSteps{
    World world;

    public LoginSteps(World world){
        this.world=world;
    }
    User user;

    @When("click on \"Sign in\" link")
    public void clickOnSignInLink(){
        loginPage = landingPage.clickOnSignInLink();
    }

    @When("click on \"Log in\" button")
    public void clickOnLogInButton(){
        userAccountPage = loginPage.clickOnSignInButton();
    }
    @When("fill an email address and password of already created user")
    public void fillEmailAndPassword(){
        world.user = new User(CREATED_USER_EMAIL,CREATED_USER_PASSWORD);
        loginPage.fillEmailAddress(world.user.getEmail());
        loginPage.fillPassword(world.user.getPassword());
    }

}
