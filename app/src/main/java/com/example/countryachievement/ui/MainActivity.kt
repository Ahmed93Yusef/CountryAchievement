package com.example.countryachievement.ui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.countryachievement.data.DataManager
import com.example.countryachievement.databinding.ActivityMainBinding
import com.example.countryachievement.util.CsvParse
import java.io.BufferedReader
import java.io.InputStreamReader
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBack()
    }
    private fun addCallBack(){
        parseFile()
        val adapter = MedalsAdapter(DataManager.medals)
        binding.recyclerMedals.adapter = adapter
    }
    private fun parseFile(){
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParse()
        buffer.forEachLine {
            val currentCountry = parser.parse(it)
            DataManager.addMedal(currentCountry)
        }
    }
}