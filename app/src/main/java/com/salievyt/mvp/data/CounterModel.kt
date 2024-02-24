package com.salievyt.mvp.data

data class CounterModel(
    var count: Int = 0

){
    fun increment () {
        count++
    }
    fun decrement () {
        count--
    }
}


