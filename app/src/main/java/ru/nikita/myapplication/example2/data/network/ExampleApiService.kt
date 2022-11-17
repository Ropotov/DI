package ru.nikita.myapplication.example2.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor() {

    fun method() {
        Log.d(TAG, "Example ApiService")
    }

    companion object{
        const val TAG = "EXAMPLE_TAG"
    }
}
