package com.example.retrofit.models

data class CountryModel(
    val numeric : String?,
    val alpha2: String?,
    val name : String?,
    val emoji : String?,
    val currency : String?,
    val latitude : Int?,
    val longitude : Int?
)