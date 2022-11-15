package ru.nikita.myapplication.example2.data

import ru.nikita.myapplication.example2.data.ExampleDatabase
import ru.nikita.myapplication.example2.data.ExampleLocalDataSource

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {

    }
}
