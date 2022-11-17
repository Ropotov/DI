package ru.nikita.myapplication.example2.presentation

import ru.nikita.myapplication.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase.invoke()
    }
}
