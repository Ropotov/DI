package ru.nikita.myapplication.example2.di

import ru.nikita.myapplication.example2.presentation.MainActivity

@dagger.Component(
    modules = [DataModule::class, DomainModule::class]
)
interface AppComponent {

    fun inject(activity: MainActivity)

}