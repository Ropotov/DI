package ru.nikita.myapplication.example2.data.dataSource

import android.util.Log
import javax.inject.Inject

class ExampleTestDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {
    override fun method() {
       Log.d("TAG", "test")
    }
}