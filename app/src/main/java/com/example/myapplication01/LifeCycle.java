package com.example.myapplication01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LifeCycle extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeCycle","调用onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","调用onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","调用onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","调用onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","调用onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","调用onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle","调用onRestart()");
    }

}
