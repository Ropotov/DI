package ru.nikita.myapplication.example2.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.nikita.myapplication.example2.data.dataSource.ExampleLocalDataSource
import ru.nikita.myapplication.example2.data.dataSource.ExampleLocalDataSourceImpl
import ru.nikita.myapplication.example2.data.dataSource.ExampleRemoteDataSource
import ru.nikita.myapplication.example2.data.dataSource.ExampleRemoteDataSourceImpl

@Module
class DataModule(
   private val context: Context
) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}