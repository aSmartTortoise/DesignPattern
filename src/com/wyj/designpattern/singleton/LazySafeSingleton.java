package com.wyj.designpattern.singleton;

/**
 *  懒汉式，线程安全。
 *  延迟初始化。
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;
    private LazySafeSingleton() {}

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
