package ir.ariyana.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.ariyana.whatsappui.databinding.ActivityMainRoomBinding

class MainActivityRoom : AppCompatActivity() {

    lateinit var binding : ActivityMainRoomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}