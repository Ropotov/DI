package ru.nikita.myapplication.example2.di

import dagger.Binds
import dagger.Module
import ru.nikita.myapplication.example2.data.dataSource.*

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    @RemoteQualifier
    @ApplicationScope
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @Binds
    @TestQualifier
    @ApplicationScope
    fun bindTestDataSource(impl: ExampleTestDataSourceImpl): ExampleRemoteDataSource
}