package com.qiushui.visitorpattern;

import java.util.Arrays;
import java.util.List;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        List<File> files = Arrays.asList(
                new TextFile("document.txt"),
                new ImageFile("image.jpg"),
                new VideoFile("video.mp4")
        );

        FileCollection collection = new FileCollection(files);

        BackupVisitor backupVisitor = new BackupVisitor();
        collection.accept(backupVisitor); // 执行备份操作
    }
}
