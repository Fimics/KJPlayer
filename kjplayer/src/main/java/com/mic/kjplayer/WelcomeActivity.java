package com.mic.kjplayer;

import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.mic.kjplayer.navgraph.AppConfig;

public class WelcomeActivity extends AppCompatActivity {

    private static final int FUTURE = 100;
    private static final int INTERVAL = 100;

    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //全屏设置
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        setContentView(R.layout.activity_welcome);
    }

    @Override
    protected void onResume() {
        super.onResume();
        queueIdle();
    }

    @Override
    protected void onPause() {
        super.onPause();
        cancelTimer();
    }

    private void queueIdle() {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            @Override
            public boolean queueIdle() {
                goHome();
                //耗时操作
                return false;
            }
        });
    }

    private void goHome() {
        countDownTimer = new CountDownTimer(FUTURE, INTERVAL) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
//                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                MainActivity.start(WelcomeActivity.this);
                finish();
            }
        };
        countDownTimer.start();
    }

    private void cancelTimer() {
        if (countDownTimer == null)
            return;
        countDownTimer.cancel();
    }
}
