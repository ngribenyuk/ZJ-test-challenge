package com.check24de.cucumber.runners;


import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.check24de.cucumber.utils.Constants.APP_URL;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/check24de/cucumber/steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public abstract class BaseTest {

    @BeforeClass
    public static void setUp() {
        Configuration.browser = System.getProperty("browser","chrome");
        Configuration.timeout = 5000;
        Configuration.baseUrl = APP_URL;
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.reportsFolder = "target/surefire-reports";
    }
}
