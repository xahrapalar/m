package com.example.m.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.m.model.nutrition_calculations;
import com.example.m.database.AppDatabase;

public class nutrition_calculations_viewmodel extends ViewModel {
    private AppDatabase database;
    private MutableLiveData<Integer> yourCalorieIntake = new MutableLiveData<>();
    private MutableLiveData<Integer> minProtein = new MutableLiveData<>();
    private MutableLiveData<Integer> maxProtein = new MutableLiveData<>();
    private MutableLiveData<Integer> minCarbs = new MutableLiveData<>();
    private MutableLiveData<Integer> maxCarbs = new MutableLiveData<>();
    private MutableLiveData<Integer> minFat = new MutableLiveData<>();
    private MutableLiveData<Integer> maxFat = new MutableLiveData<>();

    public nutrition_calculations_viewmodel() {
        // Initialize database (ensure proper context is provided in getInstance)
        database = AppDatabase.getInstance();
    }

    public void calculateNutrition(int userId, float weight, int height, int age, String weeklyActivityLevel) {
        int calorieIntake = calculateYourCalorieIntake(weight, height, age, weeklyActivityLevel);
        int minProt = calculateMinProtein(weight);
        int maxProt = calculateMaxProtein(weight);
        int minCarb = calculateMinCarbs(weight);
        int maxCarb = calculateMaxCarbs(weight);
        int minF = calculateMinFat(weight);
        int maxF = calculateMaxFat(weight);

        // Update LiveData values
        yourCalorieIntake.postValue(calorieIntake);
        minProtein.postValue(minProt);
        maxProtein.postValue(maxProt);
        minCarbs.postValue(minCarb);
        maxCarbs.postValue(maxCarb);
        minFat.postValue(minF);
        maxFat.postValue(maxF);

        // Create and insert data
        nutrition_calculations nutrition = new nutrition_calculations();
        nutrition.setUserId(userId);
        nutrition.setYourCalorieIntake(calorieIntake);
        nutrition.setProtein(minProt, maxProt);
        nutrition.setCarbs(minCarb, maxCarb);
        nutrition.setFat(minF, maxF);

        new Thread(() -> database.nutrition_calculations_Dao().insert(nutrition)).start();
    }

    private int calculateYourCalorieIntake(float weight, int height, int age, String weeklyActivityLevel) {
        int bmr = (int) (10 * weight + 6.25 * height - 5 * age + 5); // BMR for men
        switch (weeklyActivityLevel) {
            case "Low":
                return (int) (bmr * 1.2);
            case "Medium":
                return (int) (bmr * 1.55);
            default:
                return (int) (bmr * 1.9);
        }
    }

    private int calculateMinProtein(float weight) {
        return (int) (weight * 1.5);
    }

    private int calculateMaxProtein(float weight) {
        return (int) (weight * 2);
    }

    private int calculateMinCarbs(float weight) {
        return (int) (weight * 2.5);
    }

    private int calculateMaxCarbs(float weight) {
        return (int) (weight * 3);
    }

    private int calculateMinFat(float weight) {
        return (int) (weight * 0.25);
    }

    private int calculateMaxFat(float weight) {
        return (int) (weight * 0.35);
    }

    // Getters for LiveData
    public LiveData<Integer> getYourCalorieIntake() {
        return yourCalorieIntake;
    }

    public LiveData<Integer> getMinProtein() {
        return minProtein;
    }

    public LiveData<Integer> getMaxProtein() {
        return maxProtein;
    }

    public LiveData<Integer> getMinCarbs() {
        return minCarbs;
    }

    public LiveData<Integer> getMaxCarbs() {
        return maxCarbs;
    }

    public LiveData<Integer> getMinFat() {
        return minFat;
    }

    public LiveData<Integer> getMaxFat() {
        return maxFat;
    }
}
