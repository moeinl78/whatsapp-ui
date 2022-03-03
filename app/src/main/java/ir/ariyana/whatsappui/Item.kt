package ir.ariyana.whatsappui

data class Item(
    val chatProfileImage : String,
    val chatProfileName : String,
    val chatProfileLastMessage : String,
    val chatProfileLastMessageDate : String,
    val chatProfileNewMessages : Int
)