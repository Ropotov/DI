package ru.nikita.myapplication.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import ru.nikita.myapplication.ExampleApp
import ru.nikita.myapplication.R
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("ID 2", "MainActivity2")
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}