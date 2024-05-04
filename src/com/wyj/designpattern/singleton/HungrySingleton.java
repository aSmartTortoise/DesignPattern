package com.wyj.designpattern.singleton;

/**
 *  饿汉式
 *  非延迟初始化，线程安全。
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
