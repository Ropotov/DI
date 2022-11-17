package ru.nikita.myapplication.example1

@dagger.Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)

}