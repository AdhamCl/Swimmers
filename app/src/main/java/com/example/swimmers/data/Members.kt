package com.example.swimmers.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DATABASE_DATES_TABLE)
data class Dates(
    @PrimaryKey
    val dateId: Int,
    val year: Int,
    val month: Int,
    val day: Int,
    val nameOfDay: String,
)
