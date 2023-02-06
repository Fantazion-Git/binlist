package com.example.binlist.data.room.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.binlist.data.room.entity.BinRoom

interface BinDao {
    @Query("SELECT * From Bin")
    suspend fun getAll(): List<BinRoom>

    @Insert
    suspend fun insertAll(Bins : List<BinRoom>)

    @Delete
    suspend fun deleteAll(Bins: List<BinRoom>)
}