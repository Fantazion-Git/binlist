package com.example.binlist.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BankRoom(
    @PrimaryKey
    val name : String,
    val url : String,
    val phone : String,
    val city : String
)

@Entity
data class BinRoom(
    val bin : Int,
    val number : HashMap<Int,Boolean>,
    val scheme : String,
    val type : String,
    val brand : String,
    val prepaid : Boolean,
    val country : CountryRoom,
    val bank : BankRoom
)

@Entity
data class CountryRoom(
    @PrimaryKey
    val numeric : String,
    val alpha2: String,
    val name : String,
    val emoji : String,
    val currency : String,
    val latitude : Int,
    val longitude : Int
)