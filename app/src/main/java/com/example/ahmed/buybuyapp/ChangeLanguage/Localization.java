package com.example.ahmed.buybuyapp.ChangeLanguage;

import android.content.Context;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * Created by ahmed on 3/22/2017.
 */

public class Localization {
    public static void setLocale(Context context, String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());

        SwiftPrefs.with(context).add("currentLang", lang).apply();
    }
    public static String getLocale(Context ctx) {
        return SwiftPrefs.with(ctx).get("currentLang", "");
    }
}

