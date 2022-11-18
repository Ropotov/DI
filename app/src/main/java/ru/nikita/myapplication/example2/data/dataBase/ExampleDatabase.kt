package ru.nikita.myapplication.example2.data.dataBase

import android.content.Context
import android.util.Log
import ru.nikita.myapplication.R
import ru.nikita.myapplication.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val millis: Long
){

    fun method() {
        Log.d("EXAMPLE_TAG", "Example DataBase${context.getString(R.string.app_name)}$millis $this")

    }
}
