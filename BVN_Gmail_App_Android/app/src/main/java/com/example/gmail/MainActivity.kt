package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailList = listOf(
            Email("Pinterest", "Ideas for your next project", "5:30 PM", "P"),
            Email("Reddit", "Trending posts in your favorite subreddits", "4:20 PM", "R"),
            Email("Airbnb", "Explore unique stays for your next trip", "3:45 PM", "A"),
            Email("Stack Overflow", "Top answers to your recent questions", "2:15 PM", "S"),
            Email("Notion", "New templates for productivity", "1:40 PM", "N"),
            Email("Microsoft Teams", "You have a new message from the team", "12:05 PM", "M"),
            Email("Apple", "Your latest purchase receipt", "11:25 AM", "A"),
            Email("Slack", "You have unread messages", "10:00 AM", "S"),
            Email("Instagram", "New follower alert!", "9:15 AM", "I"),
            Email("GitLab", "Code review requested", "8:45 AM", "G")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}