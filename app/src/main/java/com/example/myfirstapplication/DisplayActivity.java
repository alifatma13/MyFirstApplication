package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    public static final String TAG = DisplayActivity.class.getSimpleName();
    public boolean DEBUG = BuildConfig.DEBUG;
    private TextView displayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initViews();
        if(DEBUG)
        Log.d(TAG, "onCreate: ");

        delay();
    }

    private void initViews() {
        displayName = findViewById(R.id.tvDisplayName);
        displayName.setText(getIntent().getStringExtra("name"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(DEBUG)
        {
            Log.d(TAG, "onStart: ");
            delay();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(DEBUG)
        Log.d(TAG, "onResume: ");
        delay();
    }


    @Override
    protected void onPause() {
        super.onPause();
        if(DEBUG)
        Log.d(TAG, "onPause: ");
        delay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(DEBUG)
        Log.d(TAG, "onStop: ");
        delay();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(DEBUG)
        Log.d(TAG, "onDestroy: ");
        delay();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        if(DEBUG)
        Log.d(TAG, "onRestart: ");
        delay();
    }


    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
