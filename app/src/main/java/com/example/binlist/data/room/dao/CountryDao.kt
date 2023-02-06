package com.example.binlist.data.room.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.binlist.data.room.entity.CountryRoom

interface CountryDao {
    @Query("SELECT * From Country")
    suspend fun getAll(): List<CountryRoom>

    @Insert
    suspend fun insertAll(Countries : List<CountryRoom>)

    @Delete
    suspend fun deleteAll(Countries: List<CountryRoom>)
}