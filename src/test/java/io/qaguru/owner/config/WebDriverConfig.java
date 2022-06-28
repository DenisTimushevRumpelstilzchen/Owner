package io.qaguru.owner.config;

public class WebDriverConfig {

    public String getBaseUrl(){
        System.getProperties("");
        return "https://github.com/";
    }

    public Browser getBrowser() {
        return Browser.CHROME;
    }
}
