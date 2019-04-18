package com.example.myapplication.designmodle;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    List<Observable<T>> mObservers = new ArrayList<>();

    public void rigister(Observable<T> observer) {
        if (observer == null) {
            throw new NullPointerException("observer==null");
        }
        synchronized (this) {
            if (!mObservers.contains(observer)) {
                mObservers.add(observer);
            }
        }
    }

    public synchronized void unregister(Observable<T> observable) {
        mObservers.remove(observable);
    }

}
