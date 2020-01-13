package ch.supsi.ingsw2.designpattern.command.commands;

import ch.supsi.ingsw2.designpattern.command.model.Light;

public class TurnOnLightCommand implements ICommand {

    Light light;

    public TurnOnLightCommand(Light light) {
        super();
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }

}
