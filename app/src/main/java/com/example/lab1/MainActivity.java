package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button bai1;
     Button bai2;
     Button bai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bai1.findViewById(R.id.bai1);
        bai2.findViewById(R.id.bai2);
        bai3.findViewById(R.id.bai3);
    }
}