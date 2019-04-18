package com.example.lambdaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = new Button(MainActivity.this);

        btn.setWidth(100);
        btn.setHeight(100);
        btn.setText("lambda");
        btn.setOnClickListener(view -> {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        });


    }
}
