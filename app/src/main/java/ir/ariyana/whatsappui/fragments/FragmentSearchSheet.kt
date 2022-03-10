package ir.ariyana.whatsappui.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.ariyana.whatsappui.interf.OnBackPress
import ir.ariyana.whatsappui.databinding.DialogSearchBinding

class FragmentSearchSheet(private val dataEvent : OnBackPress) : Fragment() {

    lateinit var binding : DialogSearchBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dialog = AlertDialog.Builder(context)
        binding = DialogSearchBinding.inflate(layoutInflater, null, false)
        dialog.setView(binding.root)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.searchBackButton.setOnClickListener {
            dataEvent.onBackPress()
        }
    }
}