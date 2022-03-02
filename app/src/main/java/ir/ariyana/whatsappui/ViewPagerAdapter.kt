package ir.ariyana.whatsappui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() : Int {
        return 3
    }

    override fun createFragment(position: Int) : Fragment {
        when(position) {
            0 -> {
                return FragmentChat()
            }

            1 -> {
                return FragmentCalls()
            }

            2 -> {
                return FragmentStatus()
            }

            else -> {
                return Fragment()
            }
        }
    }
}