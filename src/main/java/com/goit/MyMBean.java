package com.goit;

public interface MyMBean {
    void setIsLoger(boolean isLoger);
    boolean getIsLoger();
    void changeLogLevelInfo();
    void changeLogLevelDebug();
}
