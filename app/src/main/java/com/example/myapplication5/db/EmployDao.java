package com.example.myapplication5.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;
import static androidx.room.OnConflictStrategy.IGNORE;

@Dao
public interface EmployDao {
    @Insert(onConflict = REPLACE)
    void insertEmploy(Employee employee);
    @Insert(onConflict = IGNORE)
    void insertOrReplaceEmploy(Employee... employees);
    @Update(onConflict = REPLACE)
    void updateEmploy(Employee employee);
    @Query("DELETE FROM Employee")
    void deleteAll();
    @Query("SELECT * FROM Employee")
    List<Employee> findAllEmploySync();
}