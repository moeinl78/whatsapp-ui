package ir.ariyana.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.ariyana.whatsappui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(this)
        binding.viewPagerMainActivity.adapter = adapter
    }
}