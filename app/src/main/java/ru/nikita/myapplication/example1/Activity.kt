package ru.nikita.myapplication.example1

class Activity {


   lateinit var keyboard: Keyboard

   init {
       Component().inject(this)
   }
}