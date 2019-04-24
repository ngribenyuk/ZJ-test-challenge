package com.check24de.cucumber.models;

import static com.check24de.cucumber.utils.Constants.*;

public class SearchTravel {

    private String departureAirport;
    private String duration;
    private String startDate;
    private String endDate;

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public SearchTravel(String departureAirport, String duration, String startDate, String endDate) {
        this.departureAirport = departureAirport;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public SearchTravel() {
        this.departureAirport = AIRPORT;
        this.duration = DURATION;
        this.startDate = DEPARTURE_DATE;
        this.endDate = ARRIVAL_DATE;
    }
}
