package com.pattern.command;

import com.pattern.command.command.Command;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
