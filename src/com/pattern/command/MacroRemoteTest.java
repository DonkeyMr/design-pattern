package com.pattern.command;

import com.pattern.command.command.*;
import com.pattern.command.component.Light;
import com.pattern.command.component.Stereo;

public class MacroRemoteTest {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        Command[] onCommands = {livingRoomLightOn, kitchenLightOn, stereoOn};

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        Command[] offCommands = {livingRoomLightOff, kitchenLightOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(onCommands);
        MacroCommand partyOffMacro = new MacroCommand(offCommands);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        System.out.println("-------------------");
        remoteControl.undoButtonWasPushed();
    }
}
