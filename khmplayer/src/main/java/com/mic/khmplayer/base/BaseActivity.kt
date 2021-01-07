package com.mic.khmplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.toast

abstract class BaseActivity : AppCompatActivity(),AnkoLogger{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
        debug { "BaseActivity" }
    }

    open abstract fun getLayoutId(): Int

    protected fun initListener() {}

    protected fun initData() {}


    protected fun myToast(msg:String){
        runOnUiThread { toast(msg) }
    }

}