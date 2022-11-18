package ru.nikita.myapplication.example2.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import ru.nikita.myapplication.example2.presentation.ExampleViewModel
import ru.nikita.myapplication.example2.presentation.ExampleViewModel2

@Module
interface ViewModelModule {

    @IntoMap
    @Binds
    @StringKey("ExampleViewModel")
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel

    @IntoMap
    @Binds
    @StringKey("ExampleViewModel2")
    fun bindExampleViewModel2(impl: ExampleViewModel2): ViewModel

}