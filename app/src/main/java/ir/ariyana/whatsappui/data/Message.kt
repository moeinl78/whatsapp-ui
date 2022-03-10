package ir.ariyana.whatsappui.data

data class Message(
    val chatContent : String,
    val chatTime : String,
    val chatSeen : Boolean,
    val chatReceive : Boolean
)
