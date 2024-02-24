package com.salievyt.mvp.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.salievyt.mvp.R
import com.salievyt.mvp.data.Injector
import com.salievyt.mvp.databinding.ActivityMainBinding
import com.salievyt.mvp.presenter.PresenterContract

class MainActivity : AppCompatActivity(), PresenterContract.CounterView {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenters: PresenterContract.CounterPresenters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        presenters = Injector.getPresenter()
        presenters.attachView(this)
        initListeners()

    }
    private fun initListeners() {
        binding.btnIncrement.setOnClickListener{
            presenters.increment()
            presenters.toast()
            presenters.changeColor()

        }
        binding.btnDecrement.setOnClickListener{
            presenters.decrement()
            presenters.toast()
            presenters.changeColor()
        }

    }

    override fun colorChange() {
        binding.tvCount.setTextColor(Color.BLUE)
    }


    override fun updateCounter(counter: Int) {
        binding.tvCount.text = counter.toString()
    }

    override fun isFiveToast() {
        Toast.makeText(this, "My dostigli 5", Toast.LENGTH_SHORT).show()
    }

    override fun TenColor() {
        binding.tvCount.setTextColor(Color.BLACK)
    }
}