package ir.ariyana.whatsappui.adapters

import android.app.ActionBar
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.whatsappui.R
import ir.ariyana.whatsappui.data.Message
import ir.ariyana.whatsappui.databinding.ItemMessageBinding

class AdapterRoom(private val data : ArrayList<Message>) : RecyclerView.Adapter<AdapterRoom.ViewHolder>() {

    inner class ViewHolder(private val binding : ItemMessageBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position: Int) {

            binding.roomMessageContent.text = data[position].chatContent
            binding.roomMessageDate.text = data[position].chatTime
            if(data[position].chatSeen) {
                binding.roomDoneIcon.setColorFilter(android.R.color.holo_blue_dark)
            }
            else {
                binding.roomDoneIcon.setColorFilter(android.R.color.darker_gray)
            }

            if(data[position].chatReceived) {

                binding.roomCardView.setCardBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.white))
                val layoutParams = RecyclerView.LayoutParams(RecyclerView.LayoutParams.WRAP_CONTENT, RecyclerView.LayoutParams.WRAP_CONTENT)
                layoutParams.setMargins(8, 8, 72, 8)
            }
            else {

                binding.roomCardView.setCardBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.green_200))
                val layoutParams = RecyclerView.LayoutParams(RecyclerView.LayoutParams.WRAP_CONTENT, RecyclerView.LayoutParams.WRAP_CONTENT)
                layoutParams.setMargins(72, 8, 8, 8)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}