package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Third extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void reg(View view) {
        Intent intent=new Intent(Third.this,Fourth.class);
        startActivity(intent);


    }

    public void log(View view) {
        Intent intent=new Intent(Third.this,Fifth.class);
        startActivity(intent);
    }
}