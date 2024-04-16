package com.qiushui.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

// 具体聚合 - 列表
public class ListAggregate<T> implements Aggregate<T> {

    private List<T> items;

    public ListAggregate() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(items);
    }

}
