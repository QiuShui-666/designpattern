package com.qiushui.iteratorpattern;

// 迭代器接口
public interface Iterator<T> {

    boolean hasNext();

    T next();

}
