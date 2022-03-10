package ir.ariyana.whatsappui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.whatsappui.data.Item
import ir.ariyana.whatsappui.adapters.RecyclerAdapter
import ir.ariyana.whatsappui.databinding.FragmentChatBinding

class FragmentChat : Fragment(), RecyclerAdapter.DataEvent {

    lateinit var binding : FragmentChatBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data : ArrayList<Item> = arrayListOf(
            Item("https://www.blogads.de/account/themes/account/assets/pages/media/profile/profile_user.jpg", "Dan", "What are you doing tomorrow?", "05/03/2018", 8),
            Item("https://expertphotography.b-cdn.net/wp-content/uploads/2020/08/social-media-profile-photos-3.jpg", "Adam", "Hey, How you doing", "YESTERDAY", 2),
        )
        val recyclerAdapter = RecyclerAdapter(data, this)
        binding.chatRecyclerView.adapter = recyclerAdapter
        binding.chatRecyclerView.layoutManager = LinearLayoutManager(parentFragment?.context, RecyclerView.VERTICAL, false)

        binding.fragmentChatFAB.setOnClickListener {

        }
    }

    override fun onClickOpenChat(item: Item, itemPosition: Int) {
        TODO("Not yet implemented")
    }
}