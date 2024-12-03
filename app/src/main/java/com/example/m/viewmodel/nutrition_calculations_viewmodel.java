package com.example.m.viewmodel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.m.model.nutrition_calculations;
import com.example.m.database.AppDatabase;
public class nutrition_calculations_viewmodel extends ViewModel {
    private AppDatabase database;
    private LiveData<nutrition_calculations> nutritionData;
    private LiveData<Integer> Your_Calorie_Intake;
    private LiveData<Integer> minProtein;
    private LiveData<Integer> maxProtein;
    private LiveData<Integer> minCarbs;
    private LiveData<Integer> maxCarbs;
    private LiveData<Integer> minFat;
    private LiveData<Integer> maxFat;

    public nutrition_calculations_viewmodel() {
        database = AppDatabase.getInstance();
    }

    public AppDatabase getDatabase() {
        return database;
    }

    public void setDatabase(AppDatabase database) {
        this.database = database;
    }

    public void getNutritionData(int userId) {
        nutritionData = database.nutrition_calculations_Dao().getNutritionByUserId(userId);
    }

    public LiveData<nutrition_calculations> getNutritionData() {
        return nutritionData;
    }

    public void calculateNutrition(int userId, float weight, int height, int age, String WeeklyActivityLevel) {
        int Your_Calorie_Intake = calculateYour_Calorie_Intake(height, weight, age, WeeklyActivityLevel);
        int minProtein = calculate_minProtein(weight);
        int maxProtein = calculate_maxProtein(weight);
        int minCarbs = calculate_minCarbs(weight);
        int maxCarbs = calculate_maxCarbs(weight);
        int minFat = calculate_minFat(weight);
        int maxFat = calculate_maxFat(weight);
    }

    private int calculate_maxFat(float weight) {
        return 0;
    }

    private int calculate_minFat(float weight) {
        return 0;
    }

    private int calculate_maxCarbs(float weight) {
        return 0;
    }

    private int calculate_minCarbs(float weight) {
        return 0;
    }
    private int calculate_maxProtein(float weight) {
        return 0;
    }

    private int calculate_minProtein(float weight) {
        return 0;
    }

    private int calculateYour_Calorie_Intake(float weight, float height, int age, String WeeklyActivityLevel) {
        return (int) height;
    }

 this.Your_Calorie_Intake = new LiveData<Integer>() {
        @Override
        public Integer getValue() {
            return Your_Calorie_Intake;
        }
    };
        this.minProtein = new LiveData<Integer>() {
        @Override
        public Integer getValue() {
            return minProtein;
        }
    };
        this.maxProtein = new LiveData<Integer>() {
        @Override
        public Integer getValue() {
            return maxProtein;
        }
    };
        this.minCarbs = new LiveData<Integer>() {
        @Override
        public Integer getValue() {
            return minCarbs;
        }
    };
        this.maxCarbs = new LiveData<Integer>() {
        @Override
        public Integer getValue() {
            return maxCarbs;
        }
    };
        this.minFat = new LiveData<Integer>() {
        @Override
        public Integer getValue() {
            return minFat;
        }
    };
        this.maxFat = new LiveData<Integer>() {
        @Override
        public Integer getValue() {
            return maxFat;
        }
    }
    nutrition_calculations nutrition = new nutrition_calculations();
        nutrition.setUserId(userId);
        nutrition.setCalories(Your_Calorie_Intake);
        nutrition.setProtein(minProtein, maxProtein);
        nutrition.setCarbs(minCarbs, maxCarbs);
        nutrition.setFat(minFat, maxFat);

        new Thread(() -> database.nutrition_calculations_Dao().insert(nutrition)).start();

    private int calculateYour_Calorie_Intake(float weight, int height, int age, String WeeklyActivityLevel) {
        int bmr = (int) (10 * weight + 6.25 * height - 5 * age + 5); // برای مردان
        if (WeeklyActivityLevel.equals("Low")) {
            return (int) (bmr * 1.2);
        } else if (WeeklyActivityLevel.equals("Medium")) {
            return (int) (bmr * 1.55);
        } else {
            return (int) (bmr * 1.9);
        }
    }
    private int calculate_maxFat(float weight) {
        return (int) (weight * 0.35); // چربی 35% از وزن بدن
    }

    private int calculate_minFat(float weight) {
        return (int) (weight * 0.25); // چربی 25% از وزن بدن
    }

    private int calculate_maxCarbs(float weight) {
        return (int) (weight * 3); // کربوهیدرات 3 برابر وزن بدن
    }

    private int calculate_minCarbs(float weight) {
        return (int) (weight * 2.5); // کربوهیدرات 2.5 برابر وزن بدن
    }

    private int calculate_maxProtein(float weight) {
        return (int) (weight * 2); // پروتئین 2 برابر وزن بدن
    }

    private int calculate_minProtein(float weight) {
        return (int) (weight * 1.5); // پروتئین 1.5 برابر وزن بدن
    }
    public LiveData<Integer> getYour_Calorie_Intake() {
        return Your_Calorie_Intake;
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
