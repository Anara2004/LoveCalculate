package com.example.lovecalculate.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lovecalculate.data.models.LoveModel
import com.example.lovecalculate.databinding.ItemHistoryBinding

class HistoryAdapter(private val list: ArrayList<LoveModel>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(
            ItemHistoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class HistoryViewHolder(private val binding: ItemHistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: LoveModel) {
            with(binding) {
                tvFirstName.text = model.firstName
                tvSecondName.text = model.secondName
                tvPercentage.text = model.percentage
            }
        }

    }
}