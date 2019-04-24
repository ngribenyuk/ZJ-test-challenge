package com.check24de.cucumber.models;

import com.check24de.cucumber.utils.Constants;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class User {

    private static Random random = new Random();

    private String username = Constants.USER_NAME;
    private String password = Constants.USER_PASSWORD;
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
        String randomPrefix = String.valueOf(random.nextInt(1000) + RandomStringUtils.randomAlphabetic(2));
        this.email = username + randomPrefix + Constants.EMAIL_CLIENT;
        this.username = username + randomPrefix;
    }
    public User( String email,String password) {
        this.email = email;
        this.password = password;
    }
}
