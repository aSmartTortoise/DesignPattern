package com.wyj.designpattern.singleton;

/**
 *  登记式/静态内部类
 *  延迟初始化，线程安全。
 *  利用了classLoader机制保证了初始化instance的时只有一个线程。
 */
public class StaticScopeSingleton {
    public static class SingletonHolder {
        private static final StaticScopeSingleton INSTANCE = new StaticScopeSingleton();
    }

    private StaticScopeSingleton(){}

    public static StaticScopeSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
