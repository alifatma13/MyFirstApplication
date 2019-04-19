package com.example.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    
    public static final String TAG = MainActivity.class.getSimpleName();
    public boolean DEBUG = BuildConfig.DEBUG;
    private EditText name;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(DEBUG)
        Log.d(TAG, "onCreate: ");
        initViews();
        delay();
    }

    private void initViews() {

      name  = findViewById(R.id.eTxtNAme);
      send = findViewById(R.id.bSend);
        send.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(DEBUG)
            Log.d(TAG, "onStart: ");
        delay();

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
        Log.d(TAG, "onStop: ");
        delay();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
        delay();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
        delay();
        finish();
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.bSend:
            Intent intent = new Intent(this,DisplayActivity.class);
            intent.putExtra("name",name.getText().toString().trim());
            startActivity(intent);
        }
    }

    public void delay()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
