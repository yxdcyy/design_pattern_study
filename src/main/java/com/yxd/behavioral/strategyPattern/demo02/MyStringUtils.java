package com.yxd.behavioral.strategyPattern.demo02;

public class MyStringUtils {
    public static boolean equals(String str1, String str2) {
        if (str1 != null && str2 != null) {
            return str1.equals(str2);
        }
        return false;
    }
}
