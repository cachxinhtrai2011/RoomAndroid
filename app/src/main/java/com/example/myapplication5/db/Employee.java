package com.example.myapplication5.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Employee {

    @PrimaryKey(autoGenerate = true)
    public long employId;
    @ColumnInfo(name = "employ_name")
    public String name;

    public String designation;

}