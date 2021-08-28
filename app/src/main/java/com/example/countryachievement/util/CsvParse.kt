package com.example.countryachievement.util
import com.example.countryachievement.data.domain.Medals
class CsvParse {
    fun parse(line: String): Medals{
        val tokens = line.split(",")
        return Medals(
            rank = tokens[Constants.ColumnIndex.RANK].toInt(),
            team = tokens[Constants.ColumnIndex.TEAM],
            gold_medal = tokens[Constants.ColumnIndex.GOLD_MEDAL].toInt(),
            silver_medal = tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronze_medal = tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt(),
            total = tokens[Constants.ColumnIndex.TOTAL].toInt(),
            rank_total = tokens[Constants.ColumnIndex.RANK_TOTAL].toInt()
        )
    }
}