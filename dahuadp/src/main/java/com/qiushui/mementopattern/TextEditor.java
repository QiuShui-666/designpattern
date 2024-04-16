package com.qiushui.mementopattern;

import java.util.Stack;

// 发起人（文本编辑器）
public class TextEditor {

    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void type(String input) {
        text += input;
        System.out.println("Typing: " + input);
    }

    public TextSnapshot saveSnapshot() {
        return new TextSnapshot(text);
    }

    public void restoreSnapshot(TextSnapshot snapshot) {
        text = snapshot.getText();
        System.out.println("Restoring snapshot: " + snapshot.getText());
    }

}

// 备忘录（文本快照）
class TextSnapshot {

    private final String text;

    public TextSnapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}

// 管理者（文本历史记录）
class TextHistory {

    private Stack<TextSnapshot> undoStack = new Stack<>();

    private Stack<TextSnapshot> redoStack = new Stack<>();

    public void saveSnapshot(TextEditor editor) {
        TextSnapshot snapshot = editor.saveSnapshot();
        undoStack.push(snapshot);
        redoStack.clear();
    }

    public void undo(TextEditor editor) {
        if (!undoStack.isEmpty()) {
            TextSnapshot snapshot = undoStack.pop();
            redoStack.push(snapshot);
            editor.restoreSnapshot(snapshot);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo(TextEditor editor) {
        if (!redoStack.isEmpty()) {
            TextSnapshot snapshot = redoStack.pop();
            undoStack.push(snapshot);
            editor.restoreSnapshot(snapshot);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

}
