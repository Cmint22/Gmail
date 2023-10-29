package com.example.mail

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inboxListView: ListView = findViewById(R.id.inboxListView)
        val inboxItems = mutableListOf(
            InboxItem(R.drawable.avt1, "tran", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt2, "thi", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt3, "quynh", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt4, "tien", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt5, "tran1", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt6, "thi1", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt7, "quynh1", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt8, "tien1", "Nội dung tin nhắn mặc định")
        )

        val customAdapter = CustomAdapter(this, R.layout.list_item_inbox, inboxItems)
        inboxListView.adapter = customAdapter
    }

}
