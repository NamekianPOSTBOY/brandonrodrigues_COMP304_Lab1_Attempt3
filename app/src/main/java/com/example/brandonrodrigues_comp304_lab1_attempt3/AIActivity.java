package com.example.brandonrodrigues_comp304_lab1_attempt3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    TextView AIActivityTitle, onCreateMsgAI, onStartMsgAI, onStopMsgAI, onDestroyMsgAI;
    //booleans to check if the cycles have executed
    boolean startExeAI, createExeAI, stopExeAI, destroyExeAI = false;

    @Override
    public void onStart() {
        super.onStart();
        startExeAI = true;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createExeAI = true;
        setContentView(R.layout.activity_a_i);
        AIActivityTitle = (TextView) findViewById(R.id.AIActivityTitle);

        if(!startExeAI) {
            onStartMsgAI = (TextView) findViewById(R.id.onStartAI);
        }

        if(!createExeAI) {
            onCreateMsgAI = (TextView) findViewById(R.id.onCreateAI);
            onCreateMsgAI.setText("");
        }

        if(!stopExeAI) {
            onStopMsgAI = (TextView) findViewById(R.id.onStopAI);
            onStopMsgAI.setText("");
        }

        if(!destroyExeAI) {
            onDestroyMsgAI = (TextView) findViewById(R.id.onDestroyAI);
            onDestroyMsgAI.setText("");

        }


    }

    @Override
    public void onStop() {
        super.onStop();
        stopExeAI = true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        destroyExeAI = true;
    }
}