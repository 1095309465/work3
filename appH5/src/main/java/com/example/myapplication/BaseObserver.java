package com.example.myapplication;

import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.ResponseBody;

public abstract class BaseObserver<T> implements Observer<ResponseBody> {
    private String TAG = "BaseObserver";
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(ResponseBody responseBody) {
        Log.e(TAG, "onNext");
        if(responseBody!=null){
            onSuccess((T)responseBody);
        }else{
            onFailure((T) responseBody);

        }
    }

    public abstract  void onSuccess(T demo) ;

    public abstract  void onFailure(T t) ;
    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
//    private String TAG = "BaseObserver";
//
//    @Override
//    public void onSubscribe(Disposable d) {
//        Log.e(TAG, "onSubscribe");
//    }
//
////    @Override
////    public void onNext(BaseResponse<T> tBaseResponse) {
////        Log.e(TAG, "onNext");
////        if(tBaseResponse.getRes_code()==200){
////            onSuccess(tBaseResponse.getDemo());
////        }else{
////            onFailure(tBaseResponse.getErr_msg());
////
////        }
////    }
//
//    public  abstract void onSuccess(T demo);
//
//    public abstract void onFailure(String msg);
//
//    @Override
//    public void onError(Throwable e) {
//        Log.e(TAG, "onError");
//    }
//
//    @Override
//    public void onComplete() {
//        Log.e(TAG, "onComplete");
//    }
}
