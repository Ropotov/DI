package ru.nikita.myapplication.example2.di

import dagger.Binds
import dagger.Module
import ru.nikita.myapplication.example2.data.repository.ExampleRepositoryImpl
import ru.nikita.myapplication.example2.domain.ExampleRepository

@Module
interface DomainModule {

    @Binds
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository

}