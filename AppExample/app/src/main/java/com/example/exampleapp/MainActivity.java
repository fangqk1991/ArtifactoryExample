package com.example.exampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.module3.Module3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Module3.checkModule1();
        Module3.checkModule2();

        TextView textView = findViewById(R.id.tv_content);
        textView.setText("pass-test");
    }
}
