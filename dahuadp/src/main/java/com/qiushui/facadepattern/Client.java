package com.qiushui.facadepattern;

// 客户端
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.performComplexOperation();
    }
}
