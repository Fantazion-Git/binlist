package com.example.binlist.data.room.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.binlist.data.room.dao.BankDao
import com.example.binlist.data.room.dao.BinDao
import com.example.binlist.data.room.dao.CountryDao
import com.example.binlist.data.room.entity.BankRoom
import com.example.binlist.data.room.entity.BinRoom
import com.example.binlist.data.room.entity.CountryRoom

@Database(entities = [BinRoom::class, CountryRoom::class, BankRoom::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun BinDao(): BinDao
    abstract fun BankDao():BankDao
    abstract fun CountryDao():CountryDao
}