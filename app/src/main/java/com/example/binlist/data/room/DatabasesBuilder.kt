package com.example.binlist.data.room

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.binlist.data.room.databases.AppDatabase

object DatabasesBuilder {
    private var INSTANCE: AppDatabase? = null
    fun getInstance(context: Context): AppDatabase {
        if (INSTANCE == null) {
            synchronized(AppDatabase::class) {
                INSTANCE = buildRoomDB(context)
            }
        }
        return INSTANCE!!
    }
    private fun buildRoomDB(context: Context) =
        Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "Database"
        ).build()
}