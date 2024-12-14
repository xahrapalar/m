package com.example.m.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.m.model.DietaryPreferences;

import java.util.List;

@Dao
public interface dietary_preferences_Dao {

    @Insert
    void insert(DietaryPreferences DietaryPreferences);

    @Query("SELECT * FROM DietaryPreferences WHERE userId = :userId")
    DietaryPreferences getPreferencesForUser(int userId);

    LiveData<List<DietaryPreferences>> getAllPreferences();

    void update(DietaryPreferences preference);

    void delete(DietaryPreferences preference);

    LiveData<DietaryPreferences> getPreferencesByUserId(int userId);
}
