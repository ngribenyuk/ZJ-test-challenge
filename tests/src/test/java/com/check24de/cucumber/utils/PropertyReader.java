package com.check24de.cucumber.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    Properties properties;

    public PropertyReader() {

        try (InputStream propertyStream = PropertyReader.class.getResourceAsStream("/project.properties")) {
            properties = new Properties();
            properties.load(propertyStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties getProperties() {
        return properties;
    }
}
