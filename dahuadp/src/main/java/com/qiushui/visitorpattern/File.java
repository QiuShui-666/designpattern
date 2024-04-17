package com.qiushui.visitorpattern;

// 元素接口
public interface File {
    void accept(FileVisitor visitor);
}

