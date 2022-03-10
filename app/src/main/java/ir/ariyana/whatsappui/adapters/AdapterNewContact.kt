package ir.ariyana.whatsappui.adapters

import android.annotation.SuppressLint
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.whatsappui.databinding.ItemNewContactBinding

class AdapterNewContact : RecyclerView.Adapter<AdapterNewContact.ViewHolder>() {

    inner class ViewHolder(private val binding : ItemNewContactBinding) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindData() {
            binding.newContactTitle.text = "New contact"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemNewContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData()
    }

    override fun getItemCount(): Int {
        return 1
    }


}