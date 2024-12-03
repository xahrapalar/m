package com.example.m.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

@Entity(tableName = "user")
public class user {

    @PrimaryKey(autoGenerate = true)
    private int Id;
    @ColumnInfo(name = "name")
    private String Name;
    private String Gender;
    private int Age;
    private float Weight;
    private int Height;
    private String Goal;
    private String WeeklyActivityLevel;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public String getGoal() {
        return Goal;
    }

    public void setGoal(String Goal) {
        this.Goal = Goal;
    }

    public String getWeeklyActivityLevel() {
        return WeeklyActivityLevel;
    }

    public void setWeeklyActivityLevel(String WeeklyActivityLevel) {
        this.WeeklyActivityLevel = WeeklyActivityLevel;
    }
}