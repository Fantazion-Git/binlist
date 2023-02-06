package com.example.binlist.data.retrofit.models

data class BinModel(
    val number : HashMap<Int?,Boolean?>,
    val scheme : String?,
    val type : String?,
    val brand : String?,
    val prepaid : Boolean?,
    val country : CountryModel?,
    val bank : BankModel?
)
