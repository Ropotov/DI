package ru.nikita.myapplication.example2.domain

import ru.nikita.myapplication.example2.domain.ExampleRepository

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}
