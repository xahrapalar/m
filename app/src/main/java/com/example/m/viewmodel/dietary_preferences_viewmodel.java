package com.example.m.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.m.model.DietaryPreferences;
import com.example.m.database.AppDatabase;

public class dietary_preferences_viewmodel extends ViewModel {
    private final AppDatabase database;
    private LiveData<DietaryPreferences> DietaryPreferences;

    public dietary_preferences_viewmodel() {
        database = AppDatabase.getInstance();
    }

    public void getPreferences(int userId) {
        DietaryPreferences = database.dietary_preferences_Dao().getPreferencesByUserId(userId);
    }

    public LiveData<DietaryPreferences> getDietaryPreferences() {
        return DietaryPreferences;
    }

    public void insert(DietaryPreferences preference) {
        new Thread(() -> database.dietary_preferences_Dao().insert(preference)).start();
    }

    public void delete(DietaryPreferences preference) {
        new Thread(() -> database.dietary_preferences_Dao().delete(preference)).start();
    }

    public void update(DietaryPreferences preference) {
        new Thread(() -> database.dietary_preferences_Dao().update(preference)).start();
    }
}
