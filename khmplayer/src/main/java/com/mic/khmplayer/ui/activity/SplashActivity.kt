package com.mic.khmplayer.ui.activity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.mic.khmplayer.R
import com.mic.khmplayer.base.BaseActivity

class SplashActivity : BaseActivity(),ViewPropertyAnimatorListener {

    override fun getLayoutId(): Int {
        return R.layout.activity_splash;
    }

    override fun onAnimationStart(view: View?) {
    }

    override fun onAnimationEnd(view: View?) {
       startActivity<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {
    }


    override fun initData() {
         ViewCompat.animate(findViewById(R.id.imageView)).scaleX(1.0f).scaleY(1.0f)
                 .setListener(this).setDuration(2000)
    }

    override fun isFullScreen(): Boolean {
        return true
    }

}