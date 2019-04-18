package com.example.myapplication.designmodle.CeLueModle;

import android.util.Log;

public class WalkStrategy implements Strategy {
    String TAG = WalkStrategy.class.getSimpleName();

    @Override
    public void travel() {
        Log.e(TAG, "步行");
    }
}
