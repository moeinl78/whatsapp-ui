package ir.ariyana.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ir.ariyana.whatsappui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(this)
        binding.viewPagerMainActivity.adapter = adapter
        val mediator = TabLayoutMediator(
            binding.tabLayoutActivityMain,
            binding.viewPagerMainActivity,
            object : TabLayoutMediator.TabConfigurationStrategy {

                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {

                    when(position) {
                        0 -> {
                            tab.text = "CHAT"
                        }

                        1 -> {
                            tab.text = "STATUS"
                        }

                        2 -> {
                            tab.text = "CALLS"
                        }
                    }
                }
            }
        )
        mediator.attach()
        binding.appHeaderSearchIcon.setOnClickListener {

        }
    }
}