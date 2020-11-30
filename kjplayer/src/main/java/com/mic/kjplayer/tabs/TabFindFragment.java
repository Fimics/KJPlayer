package com.mic.kjplayer.tabs;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.mic.annotation.FragmentDestination;

@FragmentDestination(pageUrl ="main/tabs/find" ,asStarter = false)
public class TabFindFragment extends Fragment {

    public TabFindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        TextView textView = new TextView(container.getContext());
        textView.setText("find");
        return textView;
    }
}
