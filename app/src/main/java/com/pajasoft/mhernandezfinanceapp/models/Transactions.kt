package com.pajasoft.mhernandezfinanceapp.models

data class Transaction(
    val name:String,
    val category: String,
    val amount: Double,
    val time: String
)