package ru.nikita.myapplication.example2.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import ru.nikita.myapplication.ExampleApp
import ru.nikita.myapplication.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("ID", "MainActivity")
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

        findViewById<TextView>(R.id.tv).setOnClickListener {
            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}