package com.example.m.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.m.model.dietary_preferences;

import java.util.List;

@Dao
public interface dietary_preferences_Dao {

    @Insert
    void insert(dietary_preferences dietary_preferences);

    @Query("SELECT * FROM dietary_preferences WHERE userId = :userId")
    dietary_preferences getPreferencesForUser(int userId);

    LiveData<List<dietary_preferences>> getAllPreferences();

    void update(dietary_preferences preference);

    void delete(dietary_preferences preference);

    LiveData<dietary_preferences> getPreferencesByUserId(int userId);
}
