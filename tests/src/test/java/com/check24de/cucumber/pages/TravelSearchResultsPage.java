package com.check24de.cucumber.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class TravelSearchResultsPage extends BasePage {

    private ElementsCollection destinationResults = $$("#region_list_data_container li");

    public int getDestinationResultsNumber() {
        return destinationResults.size();
    }
}
