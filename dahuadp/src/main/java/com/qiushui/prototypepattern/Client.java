package com.qiushui.prototypepattern;

// 客户端
public class Client {
    public static void main(String[] args) {
        Prototype prototypeA = new ConcretePrototypeA("Original Attribute");

        // 创建原型A的副本
        Prototype clonedPrototypeA = prototypeA.clone();
        System.out.println("Original: " + prototypeA);
        System.out.println("Cloned: " + clonedPrototypeA);

        // 改变副本的属性值
        ((ConcretePrototypeA) clonedPrototypeA).setAttribute("Modified Attribute");
        System.out.println("Cloned after modification: " + clonedPrototypeA);
        System.out.println("Original remains unchanged: " + prototypeA);
    }
}
