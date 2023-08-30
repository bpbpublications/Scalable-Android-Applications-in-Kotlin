package com.example.chapter8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val userRepository = UserRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvc_view)

        val recyclerView: RecyclerView =
            findViewById(R.id.userRecyclerView)
        // initialize adapter and set on recyclerView
        val users = userRepository.getUsers() // fetch from model
        // add users to adapter
    }
}