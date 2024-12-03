package com.example.m.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Nutrition_Calculations")
public class nutrition_calculations {
    @PrimaryKey(autoGenerate = true)
    private int Id;
    private int userId;
    private int Your_Calorie_Intake;
    private int minProtein;
    private int maxProtein;
    private int minCarbs;
    private int maxCarbs;
    private int minFat;
    private int maxFat;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getYour_Calorie_Intake() {
        return Your_Calorie_Intake;
    }

    public void setYour_Calorie_Intake(int your_Calorie_Intake) {
        Your_Calorie_Intake = your_Calorie_Intake;
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

    public float getMinFat() {
        return minFat;
    }

    public void setMinFat(int minFat) {
        this.minFat = minFat;
    }

    public float getMaxFat() {
        return maxFat;
    }

    public void setMaxFat(int maxFat) {
        this.maxFat = maxFat;
    }
}
