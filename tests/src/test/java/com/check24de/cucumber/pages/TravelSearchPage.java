package com.check24de.cucumber.pages;

import com.check24de.cucumber.models.SearchTravel;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TravelSearchPage extends BasePage {

    private SelenideElement airportInput = $("#c24-travel-airport-element");
    private SelenideElement durationDropdown = $(".c24-travel-duration-overlay");
    private SelenideElement arrivalDate = $("#c24-travel-departure-date-element");
    private SelenideElement returnDate = $("#c24-travel-return-date-element");
    private SelenideElement searchButton = $("#c24-travel-search-button-element");
    private ElementsCollection durations = $$(".c24-travel-duration-box .c24-travel-radio-wrapper");

    public void selectAirport(String airport) {
        airportInput.sendKeys(airport);
        selectFromAutocomplete(airport);
    }

    public void selectDuration(String duration1) {
        durationDropdown.click();
        durations.find(text(duration1)).click();
    }

    public void selectArrivalDate(String date) {
        arrivalDate.sendKeys(date);
    }

    public void selectReturnDate(String date) {
        returnDate.sendKeys(date);
    }

    public void fillRequiredFieldsOnly(SearchTravel searchTravel) {
        selectAirport(searchTravel.getDepartureAirport());
        selectDuration(searchTravel.getDuration());
        selectArrivalDate(searchTravel.getStartDate());
        selectReturnDate(searchTravel.getEndDate());
    }

    public TravelSearchResultsPage search() {
        searchButton.click();
        return page(TravelSearchResultsPage.class);
    }

}
