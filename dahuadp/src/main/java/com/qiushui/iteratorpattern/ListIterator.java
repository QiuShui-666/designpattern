package com.qiushui.iteratorpattern;

import java.util.List;
import java.util.NoSuchElementException;

// 具体迭代器 - 列表迭代器
public class ListIterator<T> implements Iterator<T> {

    private List<T> list;

    private int index;

    public ListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(index++);
        } else {
            throw new NoSuchElementException("No more elements in the list.");
        }
    }

}
