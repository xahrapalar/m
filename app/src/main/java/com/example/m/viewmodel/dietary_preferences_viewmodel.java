package com.example.m.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.m.model.dietary_preferences;
import com.example.m.database.AppDatabase;

public class dietary_preferences_viewmodel extends ViewModel {
    private final AppDatabase database;
    private LiveData<dietary_preferences> dietary_preferences;

    public dietary_preferences_viewmodel() {
        database = AppDatabase.getInstance();
    }

    public void getPreferences(int userId) {
        dietary_preferences = database.dietary_preferences_Dao().getPreferencesByUserId(userId);
    }

    public LiveData<dietary_preferences> getDietaryPreferences() {
        return dietary_preferences;
    }

    public void insert(dietary_preferences preference) {
        new Thread(() -> database.dietary_preferences_Dao().insert(preference)).start();
    }

    public void delete(dietary_preferences preference) {
        new Thread(() -> database.dietary_preferences_Dao().delete(preference)).start();
    }

    public void update(dietary_preferences preference) {
        new Thread(() -> database.dietary_preferences_Dao().update(preference)).start();
    }
}
