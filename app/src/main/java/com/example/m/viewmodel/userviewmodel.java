package com.example.m.viewmodel;
import android.app.Application;

import androidx.lifecycle.ViewModel;

import com.example.m.database.AppDatabase;
import com.example.m.model.user;

import java.util.List;

public class userviewmodel extends ViewModel {

    private final com.example.m.dao.userDao userDao;
    private final List<user> allUsers;

    public userviewmodel(Application application) {
        super();
        AppDatabase db = AppDatabase.getInstance(application);
        assert db != null;
        userDao = db.userDao();
        allUsers = userDao.getAllUsers();
    }

    public List<user> getAllUsers() {
        return allUsers;
    }

    public void insertUser(user user) {
        AppDatabase.databaseWriteExecutor.execute(() -> userDao.insert(user));
    }

    public void deleteUser(user user) {
        AppDatabase.databaseWriteExecutor.execute(() -> userDao.delete(user));
    }
}