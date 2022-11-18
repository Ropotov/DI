package ru.nikita.myapplication.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.nikita.myapplication.example2.presentation.MainActivity
import ru.nikita.myapplication.example2.presentation.MainActivity2

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface AppComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance millis: Long
        ): AppComponent
    }
}