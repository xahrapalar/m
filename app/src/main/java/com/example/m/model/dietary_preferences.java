package com.example.m.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Dietary_Preferences")
public class dietary_preferences {
    @PrimaryKey(autoGenerate = true)
    private int Id;
    private int userId;
    private String Dietary_Preference;

    public dietary_preferences(int id) {
        Id = id;
    }

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

    public String getDietary_Preference() {
        return Dietary_Preference;
    }

    public void setDietary_Preference(String dietary_Preference) {
        Dietary_Preference = dietary_Preference;
    }
}
