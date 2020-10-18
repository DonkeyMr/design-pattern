package com.pattern.command;

import com.pattern.command.command.GarageDoorDownCommand;
import com.pattern.command.command.GarageDoorUpCommand;
import com.pattern.command.command.LightOffCommand;
import com.pattern.command.command.LightOnCommand;
import com.pattern.command.component.GarageDoor;
import com.pattern.command.component.Light;
import com.sun.deploy.net.proxy.RemoveCommentReader;

public class RemoteLoader2 {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorUpCommand, garageDoorDownCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println("------------");
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
