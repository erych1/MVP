package com.salievyt.mvp.data

import com.salievyt.mvp.presenter.CounterPresenter
import com.salievyt.mvp.presenter.PresenterContract

class Injector {
    companion object {
        fun getPresenter(): CounterPresenter {
            return CounterPresenter(CounterModel())
        }
    }
}