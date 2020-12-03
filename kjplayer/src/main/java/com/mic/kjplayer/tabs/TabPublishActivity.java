package com.mic.kjplayer.tabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mic.annotation.ActivityDestination;
import com.mic.kjplayer.BaseActivity;
import com.mic.kjplayer.R;

@ActivityDestination(pageUrl = "main/tabs/publish", needLogin = true)
public class TabPublishActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_publish);
    }
}