package com.check24de.cucumber.steps;

import com.check24de.cucumber.models.SearchTravel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;


public class TravelSearchSteps extends BaseSteps {
    SearchTravel searchTravel = new SearchTravel();

    @When("fill all required fields for search")
    public void fillRequiredFields() {
        travelSearchPage.fillRequiredFieldsOnly(searchTravel);
    }

    @When("click on Search button")
    public void clickSearchButton() {
        travelSearchResultsPage = travelSearchPage.search();
    }

    @Then("destination search results are appeared and contain at least (\\d+) item")
    public void verifySearchResults(Integer numberOfItems) {
        assertThat("Result table doesn't contain min number of items",
                travelSearchResultsPage.getDestinationResultsNumber(), greaterThanOrEqualTo(numberOfItems));
    }
}
