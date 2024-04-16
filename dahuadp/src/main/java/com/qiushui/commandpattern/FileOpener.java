package com.qiushui.commandpattern;

// 接收者 - 文件打开器
public class FileOpener {
    public void openFile(String filePath) {
        System.out.println("Opening file: " + filePath);
    }
}
