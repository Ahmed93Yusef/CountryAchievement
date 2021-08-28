package com.example.countryachievement.data.domain

data class Medals(
   val rank: Int ,
   val team: String,
   val gold_medal: Int,
   val silver_medal: Int,
   val bronze_medal: Int,
   val total: Int,
   val rank_total: Int
)