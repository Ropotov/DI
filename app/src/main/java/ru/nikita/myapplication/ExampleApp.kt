package ru.nikita.myapplication

import android.app.Application
import ru.nikita.myapplication.example2.di.DaggerAppComponent

class ExampleApp: Application() {
    val component by lazy {
        DaggerAppComponent.factory().create(this, System.currentTimeMillis())
    }
}