package com.qiushui.commandpattern;

// 调用者 - 按钮
public class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        if (command != null) {
            command.execute();
        }
    }
}
