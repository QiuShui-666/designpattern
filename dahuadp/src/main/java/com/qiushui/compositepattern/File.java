package com.qiushui.compositepattern;

// 叶子（Leaf）类 - 文件
public class File implements FileSystemObject {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemObject obj) {
        throw new UnsupportedOperationException("Files cannot contain other objects.");
    }

    @Override
    public void remove(FileSystemObject obj) {
        throw new UnsupportedOperationException("Files cannot contain other objects.");
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);
    }

}