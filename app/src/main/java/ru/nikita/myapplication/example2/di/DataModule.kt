package ru.nikita.myapplication.example2.di

import dagger.Binds
import dagger.Module
import ru.nikita.myapplication.example2.data.dataSource.ExampleLocalDataSource
import ru.nikita.myapplication.example2.data.dataSource.ExampleLocalDataSourceImpl
import ru.nikita.myapplication.example2.data.dataSource.ExampleRemoteDataSource
import ru.nikita.myapplication.example2.data.dataSource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    @ApplicationScope
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}