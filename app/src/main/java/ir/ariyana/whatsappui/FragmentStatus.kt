package ir.ariyana.whatsappui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.ariyana.whatsappui.databinding.FragmentStatusBinding

class FragmentStatus : Fragment() {

    lateinit var binding : FragmentStatusBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatusBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}