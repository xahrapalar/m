package com.example.m.database;

import android.app.Application;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.m.dao.DietaryPreferencesDao;
import com.example.m.dao.nutrition_calculations_Dao;
import com.example.m.dao.userDao;
import com.example.m.model.DietaryPreferences;
import com.example.m.model.nutrition_calculations;
import com.example.m.model.user;

import java.util.concurrent.Executor;

@Database(entities = {user.class, DietaryPreferences.class, nutrition_calculations.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public static Executor databaseWriteExecutor;

    public static AppDatabase getInstance(Application application) {
        return null;
    }

    public static AppDatabase getInstance() {
        return null;
    }

    public abstract userDao userDao();
    public abstract DietaryPreferencesDao dietary_preferences_Dao();
    public abstract nutrition_calculations_Dao nutrition_calculations_Dao();
}