package com.example.myapplication01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void gotoLifeCycle(View view){
        Intent intent=new Intent(Main.this,LifeCycle.class);
        startActivity(intent);
    }
    public void gotoHelloWorld(View view) {
        Intent intent = new Intent(Main.this, HelloWorld.class);
        startActivity(intent);
    }
}
