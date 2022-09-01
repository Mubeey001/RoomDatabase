package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "student_table")
data class Student(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "First_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val  lastName: String?,
    @ColumnInfo(name = "roll_no") val rollNo: Int?,
    )

