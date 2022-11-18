package ru.nikita.myapplication.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.nikita.myapplication.example2.presentation.MainActivity
import ru.nikita.myapplication.example2.presentation.MainActivity2

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

    @Component.Factory
    interface AppComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance millis: Long
        ): AppComponent
    }
}