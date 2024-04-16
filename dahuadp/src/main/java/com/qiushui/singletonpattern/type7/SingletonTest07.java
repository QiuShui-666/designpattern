package com.qiushui.singletonpattern.type7;

public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        // 验证
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/*
静态内部类
 */
class Singleton {

    // 1 构造器私有化
    private Singleton() {
    }

    // 2 写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3 提供一个静态的公有方法，直接返回
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}