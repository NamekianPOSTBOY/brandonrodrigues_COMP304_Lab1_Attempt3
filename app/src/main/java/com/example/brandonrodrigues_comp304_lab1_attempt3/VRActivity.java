package com.example.brandonrodrigues_comp304_lab1_attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

   TextView VRActivityTitle, onCreateMsgVR, onStartMsgVR, onStopMsgVR, onDestroyMsgVR;
   //booleans to check if the cycles have executed
    boolean startExeVR, createExeVR, stopExeVR, destroyExeVR = false;

    @Override
    public void onStart() {
        super.onStart();
        startExeVR = true;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createExeVR = true;
        setContentView(R.layout.activity_v_r);
        VRActivityTitle = (TextView) findViewById(R.id.VRActivityTitle);


        if(!startExeVR) {
            onStartMsgVR = (TextView) findViewById(R.id.onStartVR);
        }

        if(!createExeVR) {
            onCreateMsgVR = (TextView) findViewById(R.id.onCreateVR);
            onCreateMsgVR.setText("");
        }

        if(!stopExeVR) {
            onStopMsgVR = (TextView) findViewById(R.id.onStopVR);
            onStopMsgVR.setText("");
        }

        if(!destroyExeVR) {
            onDestroyMsgVR = (TextView) findViewById(R.id.onDestroyVR);
            onDestroyMsgVR.setText("");

        }


    }

    @Override
    public void onStop() {
        super.onStop();
        stopExeVR = true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        destroyExeVR = true;
    }


}