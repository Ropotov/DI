package ru.nikita.myapplication.example2.data.dataSource

import ru.nikita.myapplication.example2.data.dataBase.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
