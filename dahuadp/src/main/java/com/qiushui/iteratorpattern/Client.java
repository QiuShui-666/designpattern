package com.qiushui.iteratorpattern;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Aggregate<String> list = new ListAggregate<>();
        list.addItem("Apple");
        list.addItem("Banana");
        list.addItem("Cherry");

        Iterator<String> iterator = list.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
