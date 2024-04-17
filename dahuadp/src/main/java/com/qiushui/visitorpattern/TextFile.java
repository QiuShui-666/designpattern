package com.qiushui.visitorpattern;

// 具体元素 - 文本文件
public class TextFile implements File {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}

