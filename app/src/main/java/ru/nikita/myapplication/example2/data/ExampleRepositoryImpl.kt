package ru.nikita.myapplication.example2.data

import ru.nikita.myapplication.example2.data.ExampleLocalDataSource
import ru.nikita.myapplication.example2.data.ExampleRemoteDataSource
import ru.nikita.myapplication.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}
