package com.example.brandonrodrigues_comp304_lab1_attempt3;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BottomTextFragment extends Fragment {
TextView mainActivityTitle, onCreateMsg, onStartMsg;
boolean startExe, createExe = false;

    @Override
    public void onStart() {
        super.onStart();
        startExe = true;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createExe = true;


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View createTextView = inflater.inflate(R.layout.fragment_bottom_text, container, false);
        mainActivityTitle = (TextView) createTextView.findViewById(R.id.mainActivityTitle);


        if(createExe) {
            onCreateMsg = (TextView) createTextView.findViewById(R.id.onCreate);

        }

        if(startExe) {
            onStartMsg = (TextView) createTextView.findViewById(R.id.onStart);

        }
        return createTextView;
    }



}