package ru.nikita.myapplication.example2.data.network

import android.content.Context
import android.util.Log
import ru.nikita.myapplication.R
import ru.nikita.myapplication.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val millis: Long
) {

    fun method() {
        Log.d(TAG, "Example ApiService ${context.getString( R.string.app_name)}, $millis  $this")
    }

    companion object {
        const val TAG = "EXAMPLE_TAG"
    }
}
