package com.example.m.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Nutrition_Calculations")
public class nutrition_calculations {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int userId;
    private int yourCalorieIntake;
    private int minProtein;
    private int maxProtein;
    private int minCarbs;
    private int maxCarbs;
    private int minFat;
    private int maxFat;

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

    public int getYourCalorieIntake() {
        return yourCalorieIntake;
    }

    public void setYourCalorieIntake(int yourCalorieIntake) {
        this.yourCalorieIntake = yourCalorieIntake;
    }



    public int getMinProtein() {
        return minProtein;
    }

    public void setMinProtein(int minProtein) {
        this.minProtein = minProtein;
    }

    public int getMaxProtein() {
        return maxProtein;
    }

    public void setMaxProtein(int maxProtein) {
        this.maxProtein = maxProtein;
    }

    public int getMinCarbs() {
        return minCarbs;
    }

    public void setMinCarbs(int minCarbs) {
        this.minCarbs = minCarbs;
    }

    public int getMaxCarbs() {
        return maxCarbs;
    }

    public void setMaxCarbs(int maxCarbs) {
        this.maxCarbs = maxCarbs;
    }

    public int getMinFat() {
        return minFat;
    }

    public void setMinFat(int minFat) {
        this.minFat = minFat;
    }

    public int getMaxFat() {
        return maxFat;
    }

    public void setMaxFat(int maxFat) {
        this.maxFat = maxFat;
    }

    // Convenience methods
    public void setProtein(int minProtein, int maxProtein) {
        this.minProtein = minProtein;
        this.maxProtein = maxProtein;
    }

    public void setCarbs(int minCarbs, int maxCarbs) {
        this.minCarbs = minCarbs;
        this.maxCarbs = maxCarbs;
    }

    public void setFat(int minFat, int maxFat) {
        this.minFat = minFat;
        this.maxFat = maxFat;
    }
}
