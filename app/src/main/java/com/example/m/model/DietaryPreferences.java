package com.example.m.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "DietaryPreferences")
public class DietaryPreferences {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int userId;

    @NonNull
    private String dietaryPreference;

    // Default constructor (used by Room)
    public DietaryPreferences() {
    }

    // Constructor with all fields (ignored by Room)
    @Ignore
    public DietaryPreferences(int id, int userId, @NonNull String dietaryPreference) {
        this.id = id;
        this.userId = userId;
        this.dietaryPreference = dietaryPreference;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @NonNull
    public String getDietaryPreference() {
        return dietaryPreference;
    }

    public void setDietaryPreference(@NonNull String dietaryPreference) {
        this.dietaryPreference = dietaryPreference;
    }
}
