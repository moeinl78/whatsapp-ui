package ir.ariyana.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.ariyana.whatsappui.databinding.ActivityMainChatBinding

class MainActivityChat : AppCompatActivity() {

    lateinit var binding : ActivityMainChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainChatBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}