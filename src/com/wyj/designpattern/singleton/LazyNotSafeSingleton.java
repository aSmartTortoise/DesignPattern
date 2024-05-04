package com.wyj.designpattern.singleton;

/**
 *  懒汉式，线程不安全。
 *  延迟初始化。
 */
public class LazyNotSafeSingleton {
    private static LazyNotSafeSingleton instance;
    private LazyNotSafeSingleton() {}

    public static LazyNotSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNotSafeSingleton();
        }
        return instance;
    }
}
