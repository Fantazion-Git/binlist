package com.example.binlist.presentation.bin_list



//TODO модели для экрана

data class BinModel(
    val number : HashMap<Int,Boolean>,
    val scheme : String,
    val type : String,
    val brand : String,
    val prepaid : Boolean,
    val country : CountryModel,
    val bank : BankModel
)

data class BankModel(
    val name : String,
    val url : String,
    val phone : String,
    val city : String
)
data class CountryModel(
    val numeric : String,
    val alpha2: String,
    val name : String,
    val emoji : String,
    val currency : String,
    val latitude : Int,
    val longitude : Int
)