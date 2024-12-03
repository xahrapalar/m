package com.example.m.dao;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.m.model.user;

import java.util.List;

@Dao
public interface userDao {
    @Insert
    void insert(user user);

    @Query("SELECT * FROM user WHERE Id = :Id")
    user getUserById(int Id);

    @Query("SELECT * FROM user")
    List<user> getAllUsers();

    void delete(user user);
}
