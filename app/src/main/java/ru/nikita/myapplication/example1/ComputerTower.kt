package ru.nikita.myapplication.example1

import javax.inject.Inject

class ComputerTower(
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
)
