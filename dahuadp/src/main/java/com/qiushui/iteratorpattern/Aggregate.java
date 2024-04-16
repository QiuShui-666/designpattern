package com.qiushui.iteratorpattern;

// 聚合接口
public interface Aggregate<T> {

    Iterator<T> createIterator();

    void addItem(T item);

}
