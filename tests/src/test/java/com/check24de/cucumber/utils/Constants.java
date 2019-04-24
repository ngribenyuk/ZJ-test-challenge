package com.check24de.cucumber.utils;

import java.util.Properties;

public class Constants {
    private static Properties properties = new PropertyReader().getProperties();

    public static final String APP_DOMAIN = properties.getProperty("application.domain");
    public static final String PROTOCOL = properties.getProperty("application.protocol");
    public static final String APP_URL = PROTOCOL + APP_DOMAIN;
    public static final String REGISTER_PAGE_URL = PROTOCOL + String.format(properties.getProperty("application.register.url"), APP_DOMAIN);
    public static final String LOGOUT_URL = PROTOCOL + String.format(properties.getProperty("application.logout.url"), APP_DOMAIN);

    public static final String USER_NAME = properties.getProperty("user.name");
    public static final String USER_PASSWORD = properties.getProperty("user.password");
    public static final String EMAIL_CLIENT = properties.getProperty("user.email.client");

    public static final String DEPARTURE_DATE = properties.getProperty("departure.date");
    public static final String ARRIVAL_DATE = properties.getProperty("arrival.date");
    public static final String AIRPORT = properties.getProperty("airport.name");
    public static final String DURATION = properties.getProperty("duration");

    public static final String CREATED_USER_EMAIL = properties.getProperty("created.user.email");
    public static final String CREATED_USER_PASSWORD = properties.getProperty("created.user.password");
}
