package ru.skillbranch.devintensive.models

import java.util.*

class TextMassage(id: String,
                  from: User?,
                  chat: Chat,
                  isIncoming: Boolean = false,
                  date: Date = Date(),
                  var text:String?
):BaseMessage(id,from,chat,isIncoming,date) {
    override fun formatMassage(): String {
        TODO("Not yet implemented")
    }
}