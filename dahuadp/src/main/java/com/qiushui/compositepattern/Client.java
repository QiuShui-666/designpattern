package com.qiushui.compositepattern;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory dir1 = new Directory("Dir1");
        Directory dir2 = new Directory("Dir2");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        root.add(dir1);
        root.add(dir2);
        dir1.add(file1);
        dir2.add(file2);

        root.display(0);
    }
}
