package ir.ariyana.whatsappui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.whatsappui.data.Calls
import ir.ariyana.whatsappui.databinding.ItemCallsLayoutBinding

class RecyclerAdapterCalls(private val data : ArrayList<Calls>)
    : RecyclerView.Adapter<RecyclerAdapterCalls.ViewHolder>() {

    inner class ViewHolder(private val binding : ItemCallsLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position : Int) {
            binding.profileName.text = data[position].callProfileName
            binding.profileMessage.text = data[position].callDate
            Glide
                .with(binding.root.context)
                .load(data[position].callProfileImage)
                .into(binding.profileImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCallsLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}