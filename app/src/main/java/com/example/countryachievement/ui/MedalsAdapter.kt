package com.example.countryachievement.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.countryachievement.R
import com.example.countryachievement.data.domain.Medals
import com.example.countryachievement.databinding.ItemMedalsBinding

class MedalsAdapter(val list: List<Medals>) : RecyclerView.Adapter<MedalsAdapter.MedalsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedalsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_medals,parent,false)
        return MedalsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MedalsViewHolder, position: Int) {
        val curreentMedals = list[position]
        holder.binding.apply {
            countryName.text = curreentMedals.team
            goldMedals.text = curreentMedals.gold_medal.toString()
            silverMedals.text =curreentMedals.silver_medal.toString()
            bronzeMedals.text = curreentMedals.bronze_medal.toString()
            "Total Medals: ${curreentMedals.total}".also { total.text = it }
            "Rank: ${curreentMedals.rank}".also { rank.text = it }
            "Rank By Total: ${curreentMedals.rank_total}".also { rankTotal.text = it }
        }
    }

    override fun getItemCount() = list.size

    class MedalsViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
        val binding = ItemMedalsBinding.bind(viewItem)
    }
}