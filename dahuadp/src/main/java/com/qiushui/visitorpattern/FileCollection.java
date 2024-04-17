package com.qiushui.visitorpattern;

import java.util.List;

// 对象结构 - 文件集合
public class FileCollection {

    private List<File> files;

    public FileCollection(List<File> files) {
        this.files = files;
    }

    public void accept(FileVisitor visitor) {
        for (File file : files) {
            file.accept(visitor);
        }
    }

}
