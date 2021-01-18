package com.mic.khmplayer.base

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isFullScreen()) {
            //全屏设置
            //全屏设置
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            }
        }
        setContentView(getLayoutId())
        initListener()
        initData()
    }

    open abstract fun getLayoutId(): Int

    open protected fun initListener() {}

    open protected fun initData() {}


    open abstract fun isFullScreen(): Boolean

    inline fun <reified T : BaseActivity> startActivity() {
        val intent = Intent(this, T::class.java)
        this.startActivity(intent)
        this.finish()
    }

}