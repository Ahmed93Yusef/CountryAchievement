package com.example.countryachievement.data

import com.example.countryachievement.data.domain.Medals

object DataManager {
    private val medalsList = mutableListOf<Medals>()
    val medals: List<Medals>
    get() = medalsList
    fun addMedal(medals: Medals) = medalsList.add(medals)
}