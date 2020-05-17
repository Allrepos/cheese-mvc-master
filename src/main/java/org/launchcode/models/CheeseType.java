package org.launchcode.models;

/**
 * Created by LaunchCode
 */
public enum CheeseType {

    HARD ("Hard","test"),
    SOFT ("Soft"),
    FAKE ("Fake");

    private final String name;

    CheeseType(String name,String names) {
        this.name = name;
    }
    CheeseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
