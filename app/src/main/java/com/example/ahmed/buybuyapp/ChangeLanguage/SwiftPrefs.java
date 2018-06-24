package com.example.ahmed.buybuyapp.ChangeLanguage;

/**
 * Created by ahmed on 3/22/2017.
 */
import android.content.Context;
import android.content.SharedPreferences;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Set;

public class SwiftPrefs {

    /**
     * Using Builder Pattern to deal with SharedPreferences.
     *
     * @param context The application context.
     * @return Returns the single SharedPreferences instance that can be used to retrieve and modify the preference values.
     */
    public static Builder with(Context context) {
        return new Builder(context);
    }

    public static class Builder {

        private SharedPreferences preferences;
        private SharedPreferences.Editor editor;

        /**
         * Initiate the single SharedPreferences instance that can be used to retrieve and modify the preference values.
         *
         * @param context The application context.
         */
        private Builder(Context context) {
            preferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
            editor = preferences.edit();
        }

        /**
         * Set an int value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value int: The set of new values for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, int value) {
            editor.putInt(key, value);
            return this;
        }

        /**
         * Set a long value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value long: The set of new values for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, long value) {
            editor.putLong(key, value);
            return this;
        }

        /**
         * Set a float value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value float: The set of new values for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, float value) {
            editor.putFloat(key, value);
            return this;
        }

        /**
         * Set a double value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value double: The set of new values for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, double value) {
            editor.putString(key, String.valueOf(value));
            return this;
        }

        /**
         * Set a boolean value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value boolean: The set of new values for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, boolean value) {
            editor.putBoolean(key, value);
            return this;
        }

        /**
         * Set a String value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value String: The set of new values for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, String value) {
            editor.putString(key, value);
            return this;
        }

        /**
         * Set a Set of String value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value Set: The set of new values for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, Set<String> value) {
            editor.putStringSet(key, value);
            return this;
        }

        /**
         * Set an Object value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value Object: The new value for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, Object value) {
            editor.putString(key, serialize(value));
            return this;
        }

        /**
         * Set a List value in the preferences, to be written back once apply() is called.
         *
         * @param key   String: The name of the preference to modify.
         * @param value List: The new value for the preference.
         *              Passing null for this argument is equivalent to calling remove(String) with this key.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder add(String key, List value) {
            editor.putString(key, serialize(value));
            return this;
        }

        /**
         * Retrieve an int value from the preferences.
         *
         * @param key          String: The name of the preference to retrieve.
         * @param defaultValue int: Value to return if this preference does not exist.
         * @return Returns the preference values if they exist, or defaultValue.
         */
        public int get(String key, int defaultValue) {
            return preferences.getInt(key, defaultValue);
        }

        /**
         * Retrieve a long value from the preferences.
         *
         * @param key          String: The name of the preference to retrieve.
         * @param defaultValue long: Value to return if this preference does not exist.
         * @return Returns the preference values if they exist, or defaultValue.
         */
        public long get(String key, long defaultValue) {
            return preferences.getLong(key, defaultValue);
        }

        /**
         * Retrieve a float value from the preferences.
         *
         * @param key          String: The name of the preference to retrieve.
         * @param defaultValue float: Value to return if this preference does not exist.
         * @return Returns the preference values if they exist, or defaultValue.
         */
        public float get(String key, float defaultValue) {
            return preferences.getFloat(key, defaultValue);
        }

        /**
         * Retrieve a double value from the preferences.
         *
         * @param key          String: The name of the preference to retrieve.
         * @param defaultValue double: Value to return if this preference does not exist.
         * @return Returns the preference values if they exist, or defaultValue.
         */
        public double get(String key, double defaultValue) {
            if (!contains(key)) {
                return defaultValue;
            } else {
                return Double.parseDouble(get(key, String.valueOf(defaultValue)));
            }
        }

        /**
         * Retrieve a boolean value from the preferences.
         *
         * @param key          String: The name of the preference to retrieve.
         * @param defaultValue boolean: Value to return if this preference does not exist.
         * @return Returns the preference values if they exist, or defaultValue.
         */
        public boolean get(String key, boolean defaultValue) {
            return preferences.getBoolean(key, defaultValue);
        }

        /**
         * Retrieve a String value from the preferences.
         *
         * @param key          String: The name of the preference to retrieve.
         * @param defaultValue String: Value to return if this preference does not exist.
         * @return Returns the preference values if they exist, or defaultValue.
         */
        public String get(String key, String defaultValue) {
            return preferences.getString(key, defaultValue);
        }

        /**
         * Retrieve a set of String values from the preferences.
         *
         * @param key          String: The name of the preference to retrieve.
         * @param defaultValue Set: Value to return if this preference does not exist.
         * @return Returns the preference values if they exist, or defaultValue.
         */
        public Set<String> get(String key, Set<String> defaultValue) {
            return preferences.getStringSet(key, defaultValue);
        }

        /**
         * Retrieve a Class value from the preferences.
         *
         * @param key       String: The name of the preference to retrieve.
         * @param classType The class type.
         * @param <T>       Class<T>: The class which will return by this method.
         * @return Returns the preference value if it exists, or null.
         */
        public <T> T get(String key, Class<T> classType) {
            if (preferences.contains(key)) {
                return deserialize(get(key, ""), classType);
            } else {
                return null;
            }
        }

        /**
         * Retrieve a list value from the preferences.
         *
         * @param key String: The name of the preference to retrieve.
         * @return Returns the preference value if it exists, or null.
         */
        public List get(String key) {
            if (preferences.contains(key)) {
                return deserialize(get(key, ""), List.class);
            } else {
                return null;
            }
        }

        /**
         * Checks whether the preferences contains a preference.
         *
         * @param key String: The name of the preference to retrieve.
         * @return Returns true if the preference exists in the preferences, otherwise false.
         */
        public boolean contains(String key) {
            return preferences.contains(key);
        }

        /**
         * Mark that a preference(s) value(s) should be removed,
         * which will be done in the actual preferences once apply() is called.
         *
         * @param keys String: The name(s) of the preference(s) to retrieve.
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder remove(String... keys) {
            for (String key : keys) {
                editor.remove(key);
            }
            return this;
        }

        /**
         * Remove all values from the preferences.
         * Once apply is called, the only remaining preferences will be any that you have defined in this editor.
         *
         * @return Returns a reference to the same Preferences object, so you can chain calls together.
         */
        public Builder clearAll() {
            editor.clear();
            return this;
        }

        /**
         * Commit your preferences changes back from this Editor to the SharedPreferences object it is editing.
         * This atomically performs the requested modifications, replacing whatever is currently in the SharedPreferences.
         */
        public void apply() {
            editor.apply();
        }

        private String serialize(Object o) {
            try {
                ByteArrayOutputStream bo = new ByteArrayOutputStream();
                ObjectOutputStream so = new ObjectOutputStream(bo);
                so.writeObject(o);
                so.flush();
                return bo.toString();
            } catch (Exception e) {
                return null;
            }
        }

        private <T> T deserialize(String s, Class<T> tClass) {
            try {
                byte b[] = s.getBytes();
                ByteArrayInputStream bi = new ByteArrayInputStream(b);
                ObjectInputStream si = new ObjectInputStream(bi);
                Object o = si.readObject();
                return tClass.cast(o);
            } catch (Exception e) {
                return null;
            }
        }
    }
}