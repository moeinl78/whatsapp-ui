package ir.ariyana.whatsappui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.whatsappui.data.NewChat
import ir.ariyana.whatsappui.databinding.ItemNewChatBinding

class AdapterNewChat(private val data : ArrayList<NewChat>) : RecyclerView.Adapter<AdapterNewChat.ViewHolder>() {

    inner class ViewHolder(private val binding : ItemNewChatBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position: Int) {

            binding.newChatProfileName.text = data[position].newChatTitle
            binding.newChatBeo.text = data[position].newChatBeo
            Glide
                .with(binding.root.context)
                .load(data[position].newChatImage)
                .into(binding.newChatProfileImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemNewChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}