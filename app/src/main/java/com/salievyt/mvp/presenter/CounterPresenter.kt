package com.salievyt.mvp.presenter

import com.salievyt.mvp.data.CounterModel
import com.salievyt.mvp.ui.MainActivity

class CounterPresenter(
    private val model: CounterModel
) : PresenterContract.CounterPresenters {
    private lateinit var counterView: PresenterContract.CounterView
    override fun increment() {
        model.increment()
        counterView.updateCounter(model.count)
    }

    override fun decrement() {
        model.decrement()
        counterView.updateCounter(model.count)
    }

    override fun attachView(view: MainActivity) {
        this.counterView = view
    }

    override fun toast() {
        if (model.count == 5) {
            counterView.updateCounter(model.count)
        }
    }

    override fun changeColor() {
        if (model.count == 10) {
            counterView.colorChange()
        }else {
            counterView.TenColor()
        }
    }



}