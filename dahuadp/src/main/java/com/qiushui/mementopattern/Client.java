package com.qiushui.mementopattern;

// 客户端代码
public class Client {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor("");
        TextHistory history = new TextHistory();

        editor.type("Hello, ");
        history.saveSnapshot(editor);
        editor.type("World!");
        history.saveSnapshot(editor);

        history.undo(editor);
        history.redo(editor);
    }

}
