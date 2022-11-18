package ru.nikita.myapplication.example2.data.repository

import ru.nikita.myapplication.example2.data.dataSource.ExampleLocalDataSource
import ru.nikita.myapplication.example2.data.dataSource.ExampleRemoteDataSource
import ru.nikita.myapplication.example2.data.mapper.ExampleMapper
import ru.nikita.myapplication.example2.di.RemoteQualifier
import ru.nikita.myapplication.example2.di.TestQualifier
import ru.nikita.myapplication.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @RemoteQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
