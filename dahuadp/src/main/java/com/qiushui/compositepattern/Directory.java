package com.qiushui.compositepattern;

import java.util.ArrayList;
import java.util.List;

// 组合（Composite）类 - 文件夹
public class Directory implements FileSystemObject {
    private List<FileSystemObject> children;
    private String name;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void add(FileSystemObject obj) {
        children.add(obj);
    }

    @Override
    public void remove(FileSystemObject obj) {
        children.remove(obj);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb + name);

        for (FileSystemObject child : children) {
            child.display(depth + 1);
        }
    }
}
