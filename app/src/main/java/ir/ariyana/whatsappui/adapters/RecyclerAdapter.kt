package ir.ariyana.whatsappui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.whatsappui.data.Item
import ir.ariyana.whatsappui.databinding.ItemLayoutBinding

class RecyclerAdapter(private val data : ArrayList<Item>, private val dataEvent : DataEvent) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding : ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position: Int) {
            binding.profileName.text = data[position].chatProfileName
            binding.profileMessage.text = data[position].chatProfileLastMessage
            binding.chatTimer.text = data[position].chatProfileLastMessageDate
            binding.chatAlert.text = data[position].chatProfileNewMessages.toString()
            Glide
                .with(binding.root.context)
                .load(data[position].chatProfileImage)
                .into(binding.profileImage)

            itemView.setOnClickListener {
                dataEvent.onClickOpenChat(data[adapterPosition], adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface DataEvent {
        fun onClickOpenChat(item : Item, itemPosition : Int)
    }
}