package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TEST", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TEST", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TEST", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TEST", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TEST", "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TEST", "onRestart");

    }
}