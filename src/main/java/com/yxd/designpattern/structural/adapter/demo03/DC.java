package com.yxd.designpattern.structural.adapter.demo03;

public interface DC {
    default int output5V() {
        return 0;
    }
    default int output12V() {
        return 0;
    }
    default int output24V() {
        return 0;
    }
    default int output36V() {
        return 0;
    }
}
