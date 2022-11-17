package ru.nikita.myapplication.example2.data.dataBase

import android.content.Context
import android.util.Log
import ru.nikita.myapplication.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
){

    fun method() {
        Log.d("EXAMPLE_TAG", "Example DataBase ${context.getString(R.string.app_name)}")

    }
}
