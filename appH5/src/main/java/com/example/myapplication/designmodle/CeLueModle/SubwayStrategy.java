package com.example.myapplication.designmodle.CeLueModle;

import android.util.Log;

public class SubwayStrategy implements Strategy {
    String TAG = SubwayStrategy.class.getSimpleName();

    @Override
    public void travel() {
        Log.e(TAG, "地铁");
    }
}
