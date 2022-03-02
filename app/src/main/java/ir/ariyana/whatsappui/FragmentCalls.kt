package ir.ariyana.whatsappui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.ariyana.whatsappui.databinding.FragmentCallsBinding

class FragmentCalls : Fragment() {

    lateinit var binding : FragmentCallsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCallsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}