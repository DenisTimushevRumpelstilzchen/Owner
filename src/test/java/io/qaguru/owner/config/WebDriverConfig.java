package io.qaguru.owner.config;

public class WebDriverConfig {

    public Browser getBrowser(){
        return Browser.CHROME;
    }

    public String getBaseUrl(){
        return "https://testing.github.com/";
    }
}