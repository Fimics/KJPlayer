package com.mic.khmplayer.ui.activity

import android.os.Bundle
import com.mic.khmplayer.R
import com.mic.khmplayer.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun isFullScreen(): Boolean {
        return true
    }


}