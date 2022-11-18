package ru.nikita.myapplication.example2.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.nikita.myapplication.example2.presentation.ExampleViewModel

@Module
interface ViewModelModule {

    @IntoMap
    @Binds
    @ViewModelKey(ExampleViewModel::class)
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel

}