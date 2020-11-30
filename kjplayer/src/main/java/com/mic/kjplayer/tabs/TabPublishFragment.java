package com.mic.kjplayer.tabs;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


//@FragmentDestination(pageUrl ="main/tabs/publish" ,asStarter = false)
public class TabPublishFragment extends Fragment {


    public TabPublishFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        TextView textView = new TextView(container.getContext());
        textView.setText("publish");
        return textView;
    }



}
