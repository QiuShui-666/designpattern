package com.qiushui.compositepattern;

// 组件（Component）接口
public interface FileSystemObject {
    void add(FileSystemObject obj);
    void remove(FileSystemObject obj);
    void display(int depth);
}
