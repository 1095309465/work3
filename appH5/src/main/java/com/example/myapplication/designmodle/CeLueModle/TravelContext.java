package com.example.myapplication.designmodle.CeLueModle;

/**
 * 策略模式
 */
public class TravelContext {

    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        if (strategy != null) {
            strategy.travel();
        }
    }


}
