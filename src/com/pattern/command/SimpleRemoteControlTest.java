package com.pattern.command;

import com.pattern.command.command.GarageDoorUpCommand;
import com.pattern.command.command.LightOnCommand;
import com.pattern.command.component.GarageDoor;
import com.pattern.command.component.Light;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorUpCommand);
        remote.buttonWasPressed();
    }
}
