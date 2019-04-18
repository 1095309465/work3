package com.example.myapplication.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.designmodle.BuildModle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BuildModle  buildModle=new BuildModle.Build().setName("asd").setLike("打球").setAge(18).create();

    }




}
