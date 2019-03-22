package com.example.myapplication01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;

public class Main2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }
    public void gotoLinear(View view){
        Intent intent=new Intent(Main2.this,Linear_Layout.class);
        startActivity(intent);
    }
    public void gotoTable(View view) {
        Intent intent = new Intent(Main2.this, Table_Layout.class);
        startActivity(intent);
    }
    public void gotoConstraint(View view) {
        Intent intent = new Intent(Main2.this, Constraint_Layout.class);
        startActivity(intent);
    }
}
