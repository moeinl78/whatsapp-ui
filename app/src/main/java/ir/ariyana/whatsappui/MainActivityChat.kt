package ir.ariyana.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.whatsappui.adapters.AdapterNewChat
import ir.ariyana.whatsappui.adapters.AdapterNewContact
import ir.ariyana.whatsappui.adapters.AdapterNewGroup
import ir.ariyana.whatsappui.data.NewChat
import ir.ariyana.whatsappui.databinding.ActivityMainChatBinding

class MainActivityChat : AppCompatActivity() {

    lateinit var binding : ActivityMainChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data : ArrayList<NewChat> = arrayListOf(
            NewChat("Moein Latifi", "Lorem Ipsum is simply dummy text", "https://www.rd.com/wp-content/uploads/2017/09/01-shutterstock_476340928-Irina-Bg.jpg"),
            NewChat("John", "remaining essentially unchanged. It was popularised in the 1960s", "https://www.business2community.com/wp-content/uploads/2014/04/profile-picture-300x300.jpg"),
            NewChat("Cousin", "It is a long established fact that a reader will be distracted", "https://preview.redd.it/2pm4mgw45qx11.jpg?width=640&crop=smart&auto=webp&s=b1659833767350c90c8ef4fa774307be5afbe2a7"),
            NewChat("Akbar", "The standard chunk of Lorem Ipsum used since the 1500s", "https://www.blogads.de/account/themes/account/assets/pages/media/profile/people19.png"),
            NewChat("Mohandes", "There are many variations of passages of Lorem Ipsum", "https://preview.redd.it/l9zm6t42peu41.jpg?auto=webp&s=09073c88e5771a510b9055f46747fa2fc37a48d6"),
        )
        val adapterList = mutableListOf<RecyclerView.Adapter<*>>()
            .apply {
                add(AdapterNewGroup())
                add(AdapterNewContact())
                add(AdapterNewChat(data))
            }
        val adapter = ConcatAdapter(adapterList)
        binding.mainNewRecyclerView.adapter = adapter
        binding.mainNewRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }
}