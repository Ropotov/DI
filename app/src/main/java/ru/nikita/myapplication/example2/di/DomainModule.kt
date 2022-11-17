package ru.nikita.myapplication.example2.di

import dagger.Module
import dagger.Provides
import ru.nikita.myapplication.example2.data.repository.ExampleRepositoryImpl
import ru.nikita.myapplication.example2.domain.ExampleRepository

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }

}