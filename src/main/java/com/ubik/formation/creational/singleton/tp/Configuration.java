package com.ubik.formation.creational.singleton.tp;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    public Map<String, String> settings;

    private static Configuration instance = new Configuration();

    private Configuration() {
        instance.settings = new HashMap<String, String>();
        instance.settings.put("NAME", "GlobalCorpApp");
        instance.settings.put("VERSION", "1.0.0");
        instance.settings.put("DESCRIPTION", "My App is doing nothing");
        instance.settings.put("ENVIRONMENT", "dev");
        instance.settings.put("SQL_LOGIN", "GlobalCorp");
        instance.settings.put("SQL_PASSWORD", "definitelyasafepassword");
        instance.settings.put("INVOICE_API_KEY", "987654321azerty");
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public static String getSetting(String key) {
        return getInstance().settings.get(key);
    }

    public static void setSetting(String key, String value) {
        getInstance().settings.put(key, value);
    }
}
