package ch.supsi.ingsw2.designpattern.command;

import ch.supsi.ingsw2.designpattern.command.commands.StartFanCommand;
import ch.supsi.ingsw2.designpattern.command.commands.StopFanCommand;
import ch.supsi.ingsw2.designpattern.command.commands.TurnOnLightCommand;
import ch.supsi.ingsw2.designpattern.command.model.Fan;
import ch.supsi.ingsw2.designpattern.command.model.Light;

public class Demo {

    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan livingRoomFan = new Fan();
        Light bedRoomLight = new Light();
        Fan bedRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new TurnOnLightCommand(livingRoomLight));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new TurnOnLightCommand(bedRoomLight));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new StartFanCommand(livingRoomFan));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new StopFanCommand(livingRoomFan));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new StartFanCommand(bedRoomFan));
        remote.buttonPressed();
        System.out.println("*********************************");

        remote.setCommand(new StopFanCommand(bedRoomFan));
        remote.buttonPressed();
        System.out.println("*********************************");
    }
}
