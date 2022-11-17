package ru.nikita.myapplication.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.nikita.myapplication.R
import ru.nikita.myapplication.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component = DaggerAppComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}