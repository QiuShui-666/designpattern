package com.qiushui.visitorpattern;

public class VideoFile implements File {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }

}
