package com.mic.kjplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}