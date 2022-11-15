package ru.nikita.myapplication.example2.data

import ru.nikita.myapplication.example2.data.ExampleApiService
import ru.nikita.myapplication.example2.data.ExampleRemoteDataSource

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}
