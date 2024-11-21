package com.ubik.formation.creational.singleton.tp;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    private Map<String, String> settings;

    private static Configuration instance;

    private Configuration() {
        settings = new HashMap<>();
        settings.put("NAME", "GlobalCorpApp");
        settings.put("VERSION", "1.0.0");
        settings.put("DESCRIPTION", "My App is doing nothing");
        settings.put("ENVIRONMENT", "dev");
        settings.put("SQL_LOGIN", "GlobalCorp");
        settings.put("SQL_PASSWORD", "definitelyasafepassword");
        settings.put("INVOICE_API_KEY", "987654321azerty");
    }

    public static synchronized Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
