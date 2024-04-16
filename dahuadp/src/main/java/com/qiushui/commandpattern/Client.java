package com.qiushui.commandpattern;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        FileOpener fileOpener = new FileOpener();
        OpenFileCommand openFileCommand = new OpenFileCommand(fileOpener, "example.txt");

        Button button = new Button();
        button.setCommand(openFileCommand);
        button.onClick(); // 输出：Opening file: example.txt
    }
}
