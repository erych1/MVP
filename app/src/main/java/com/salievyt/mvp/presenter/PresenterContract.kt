package com.salievyt.mvp.presenter

import com.salievyt.mvp.ui.MainActivity

class PresenterContract {
    interface CounterView {
        fun colorChange()
        fun updateCounter(counter: Int)
        fun isFiveToast()
        fun TenColor()
    }
    interface CounterPresenters {
        fun changeColor()
        fun toast()
        fun increment()
        fun decrement()
        fun attachView(view: MainActivity)
    }
}