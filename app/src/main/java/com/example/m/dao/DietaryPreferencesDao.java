package com.example.m.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.m.model.DietaryPreferences;

import java.util.List;

@Dao
public interface DietaryPreferencesDao {

    // Insert a new dietary preference
    @Insert
    void insert(DietaryPreferences dietaryPreferences);

    // Get dietary preferences for a specific user
    @Query("SELECT * FROM DietaryPreferences WHERE userId = :userId")
    LiveData<DietaryPreferences> getPreferencesForUser(int userId);

    // Get all dietary preferences
    @Query("SELECT * FROM DietaryPreferences")
    LiveData<List<DietaryPreferences>> getAllPreferences();

    // Update a dietary preference
    @Update
    void update(DietaryPreferences dietaryPreferences);

    // Delete a dietary preference
    @Delete
    void delete(DietaryPreferences dietaryPreferences);

    // Get preferences by userId
    @Query("SELECT * FROM DietaryPreferences WHERE userId = :userId")
    LiveData<DietaryPreferences> getPreferencesByUserId(int userId);
}
