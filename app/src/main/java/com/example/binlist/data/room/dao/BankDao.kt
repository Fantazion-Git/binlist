package com.example.binlist.data.room.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.binlist.data.room.entity.BankRoom

interface BankDao {
    @Query("SELECT * From Bank")
    suspend fun getAll(): List<BankRoom>

    @Insert
    suspend fun insertAll(banks : List<BankRoom>)

    @Delete
    suspend fun deleteAll(banks: List<BankRoom>)
}