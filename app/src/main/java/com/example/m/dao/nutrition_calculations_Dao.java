package com.example.m.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.m.model.nutrition_calculations;

@Dao
public interface nutrition_calculations_Dao {
    @Insert
    void insert(nutrition_calculations nutrition_Calculations);

    @Query("SELECT * FROM nutrition_calculations WHERE userId = :userId")
    nutrition_calculations getNutritionForUser(int userId);

    @Query("SELECT * FROM nutrition_calculations WHERE userId = :userId")
    LiveData<nutrition_calculations> getNutritionByUserId(int userId);
}
