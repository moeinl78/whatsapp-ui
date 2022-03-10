package ir.ariyana.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.whatsappui.adapters.AdapterRoom
import ir.ariyana.whatsappui.data.Message
import ir.ariyana.whatsappui.databinding.ActivityMainRoomBinding

class MainActivityRoom : AppCompatActivity() {

    lateinit var binding : ActivityMainRoomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data : ArrayList<Message> = arrayListOf(
            Message("facilisis magna etiam tempor orci eu lobortis", "12:54 AM", true, true),
            Message("Sem fringilla ut morbi tincidunt augue interdum velit euismod in.", "22:54 PM", true, false),
            Message("Ac turpis egestas maecenas pharetra convallis posuere. Tincidunt ornare massa eget", "12:54 AM", true, true),
            Message("Id diam maecenas ultricies mi eget. Tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada proin libero. Amet mattis vulputate enim nulla. Quis enim lobortis scelerisque fermentum dui faucibus. Auctor urna nunc id cursus. Orci porta non pulvinar neque. ", "12:54 AM", true, false),
            Message("Pellentesque eu tincidunt tortor aliquam nulla facilisi cras fermentum. Venenatis tellus in metus vulputate. Lectus magna fringilla urna porttitor rhoncus dolor purus non.", "12:54 AM", true, true),
            Message("Commodo odio aenean sed adipiscing diam donec adipiscing tristique. Vulputate enim nulla aliquet porttitor lacus.", "12:54 AM", true, true),
            Message("Diam sit amet nisl suscipit adipiscing bibendum est.Dictum fusce ut placerat orci.", "12:54 AM", true, false),
        )
        val adapter = AdapterRoom(data)
        binding.roomRecyclerView.adapter = adapter
        binding.roomRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }
}