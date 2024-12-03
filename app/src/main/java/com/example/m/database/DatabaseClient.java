package com.example.m.database;
import android.content.Context;
import androidx.room.Room;
public class DatabaseClient {
    private static DatabaseClient instance;
    private final AppDatabase AppDatabase;

    private DatabaseClient(Context context) {
        AppDatabase = Room.databaseBuilder(
                context.getApplicationContext(),
                AppDatabase.class,
                "my_database"
        ).build();
    }

    public static synchronized DatabaseClient getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseClient(context);
        }
        return instance;
    }

    public AppDatabase getAppDatabase() {
        return AppDatabase;
    }
}
