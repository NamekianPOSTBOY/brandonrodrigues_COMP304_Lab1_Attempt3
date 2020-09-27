package com.example.brandonrodrigues_comp304_lab1_attempt3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomTextFragment extends Fragment {
TextView onCreateMsg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View createTextView = inflater.inflate(R.layout.fragment_bottom_text, container, false);
        onCreateMsg = (TextView) createTextView.findViewById(R.id.onCreate);
        return createTextView;
    }
}