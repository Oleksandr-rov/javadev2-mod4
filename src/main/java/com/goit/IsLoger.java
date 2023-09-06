package com.goit;

public class IsLoger {
    private boolean isLog;
    public boolean getValue() {
        return isLog;
    }

    public void setValue(boolean log) {
        isLog = log;
    }

    private IsLoger() {
    }
    private static IsLoger isLoger;
    public static synchronized IsLoger getInstance(){
        if(isLoger == null)
            isLoger = new IsLoger();
        return isLoger;
    }
}
