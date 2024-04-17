package com.qiushui.visitorpattern;

// 访问者接口
public interface FileVisitor {
    void visit(TextFile file);
    void visit(ImageFile file);
    void visit(VideoFile file);
}