package ru.nikita.myapplication.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.nikita.myapplication.R
import ru.nikita.myapplication.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.computer.toString()
    }
}