package com.example.swimmers.data

import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface SwimmersDao {

    @Query("SELECT * FROM members_table ORDER BY id ASC")
    fun getAllMembers(): Flow<List<Members>>


}