package com.mic.khmplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }

   open abstract fun getLayoutId():Int

   open abstract fun initListener():Unit

   open abstract fun initData()

}