package com.qiushui.commandpattern;

// 具体命令 - 打开文件命令
public class OpenFileCommand implements Command {
    private FileOpener fileOpener;
    private String filePath;

    public OpenFileCommand(FileOpener fileOpener, String filePath) {
        this.fileOpener = fileOpener;
        this.filePath = filePath;
    }

    @Override
    public void execute() {
        fileOpener.openFile(filePath);
    }
}
