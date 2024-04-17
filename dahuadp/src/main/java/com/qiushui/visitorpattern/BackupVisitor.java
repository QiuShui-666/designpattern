package com.qiushui.visitorpattern;

// 具体访问者 - 备份文件访问者
public class BackupVisitor implements FileVisitor {
    @Override
    public void visit(TextFile file) {
        System.out.println("Backing up text file: " + file.getName());
        // 执行备份操作...
    }

    @Override
    public void visit(ImageFile file) {
        System.out.println("Backing up image file: " + file.getName());
        // 执行备份操作...
    }

    @Override
    public void visit(VideoFile file) {
        System.out.println("Backing up video file: " + file.getName());
        // 执行备份操作...
    }
}

