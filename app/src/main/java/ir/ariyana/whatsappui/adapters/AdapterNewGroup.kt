package ir.ariyana.whatsappui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.whatsappui.databinding.ItemNewGroupBinding

class AdapterNewGroup : RecyclerView.Adapter<AdapterNewGroup.ViewHolder>() {

    inner class ViewHolder(private val binding : ItemNewGroupBinding) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindData() {
            binding.newGroupTitle.text = "New group"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemNewGroupBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData()
    }

    override fun getItemCount(): Int {
        return 1
    }
}