package ru.nikita.myapplication.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.nikita.myapplication.example2.presentation.MainActivity

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface AppComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance millis: Long
        ): AppComponent
    }
}